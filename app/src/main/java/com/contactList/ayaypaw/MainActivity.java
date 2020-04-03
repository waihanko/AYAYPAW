package com.contactList.ayaypaw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import com.contactList.ayaypaw.data.StateCreator;
import com.contactList.ayaypaw.model.EmergencyDataModel;
import com.contactList.ayaypaw.retrofit.API_Interface;
import com.contactList.ayaypaw.retrofit.ApiUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.contactList.ayaypaw.data_model.ContactModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ContactModel> contactList = new ArrayList<>();
    private List<ContactModel> contactListClone = new ArrayList<>();
    private RecyclerView recyclerView;
    private ContactListAdapter contactListAdapter;
    API_Interface emergencyContactInterface;
    List<List<String>> value;
    private String TAG = "Response";
    private String contactData[][];
    private SearchView searchView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.RECEIVE_SMS, Manifest.permission.READ_SMS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 101);
        recyclerView = (RecyclerView) findViewById(R.id.contact_list);
        progressBar = (ProgressBar) findViewById(R.id.pb_loading);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUtils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        emergencyContactInterface = retrofit.create(API_Interface.class);

        Call<EmergencyDataModel> call = emergencyContactInterface.getAllContact();
        call.enqueue(new Callback<EmergencyDataModel>() {
            @Override
            public void onResponse(Call<EmergencyDataModel> call, Response<EmergencyDataModel> response) {
                if (response.isSuccessful()) {
                    EmergencyDataModel contactListData = response.body();
                    Log.i("Success", "API Success ");
                    value = contactListData.getValues();

                    contactData = new String[value.size()][10];
                    for (int i = 0; i < value.size(); i++) {

                        for (int j = 0; j < 10; j++) {
                            contactData[i][j] = value.get(i).get(j);
                        }


                        ContactModel contactModel = new ContactModel(value.get(i).get(1), value.get(i).get(5),
                                value.get(i).get(7), value.get(i).get(3), value.get(i).get(8),
                                value.get(i).get(0), value.get(i).get(2), value.get(i).get(4), value.get(i).get(6), value.get(i).get(9));
                        contactList.add(contactModel);

                        Log.i("Data", contactData[i][8]);

                    }
                    contactListClone = contactList;
                    contactListAdapter = new ContactListAdapter(contactList);
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(contactListAdapter);
                    progressBar.setVisibility(View.INVISIBLE );
                } else {
                    int statusCode = response.code();
                    Log.d(TAG, statusCode + "");
                    Toast.makeText(getApplicationContext(), statusCode + "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<EmergencyDataModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("Fail", t.getMessage());

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Log.i("GET_STATE", StateCreator.getInstance().getAllStateList().size() + "");
        getMenuInflater().inflate(R.menu.option_menu, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // filter recycler view when query submitted
                contactListAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
              //  contactListAdapter = new ContactListAdapter(ContactListAdapter.contactListFiltered);
                if (query.isEmpty()){
                    contactListAdapter = new ContactListAdapter(contactListClone);
                    recyclerView.setAdapter(contactListAdapter);
                    contactListAdapter.notifyDataSetChanged();
                }else {
                    ContactListAdapter.contactModelList = contactListClone;
                    contactListAdapter.getFilter().filter(query);
                    recyclerView.setAdapter(contactListAdapter);
                }


                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        } else {
            startActivity(new Intent(this, AboutActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

}
