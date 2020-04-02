package com.contactList.ayaypaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
    private RecyclerView recyclerView;
    private ContactListAdapter contactListAdapter;
    API_Interface emergencyContactInterface;
    List<List<String>> value;
    private String TAG = "Response";
    private String contactData[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.contact_list);
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

                        for (int j = 0; j<10;j++){
                            contactData[i][j] = value.get(i).get(j);
                        }



                        ContactModel contactModel = new ContactModel(value.get(i).get(1), value.get(i).get(5),
                                value.get(i).get(7), value.get(i).get(3), value.get(i).get(8),
                                value.get(i).get(0), value.get(i).get(2), value.get(i).get(4), value.get(i).get(6), value.get(i).get(9));
                        contactList.add(contactModel);

                        // Log.i("Data", contactData[i][0]);

                    }
                    contactListAdapter = new ContactListAdapter(contactList);
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(contactListAdapter);


                    Toast.makeText(getApplicationContext(), "API Succcess" + contactListData.getValues().size(), Toast.LENGTH_SHORT).show();

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


}
