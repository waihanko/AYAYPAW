package com.contactList.ayaypaw;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {
    API_Interface emergencyContactInterface;
    private String TAG = "Response";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUtils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        emergencyContactInterface =retrofit.create(API_Interface.class);

        Call<List<EmergencyDataModel>> call = emergencyContactInterface.getAllContact();
        call.enqueue(new Callback<List<EmergencyDataModel>>() {
            @Override
            public void onResponse(Call<List<EmergencyDataModel>> call, Response<List<EmergencyDataModel>> response) {
                if (response.isSuccessful()) {
                    List<EmergencyDataModel> contactList = response.body();
                    Log.i("Success", "API Success " + response.body().toString());
                    Toast.makeText(getApplicationContext(), "API Succcess" + contactList.size(), Toast.LENGTH_SHORT).show();

                } else {
                    int statusCode = response.code();
                    Log.d(TAG,statusCode+"");
                    Toast.makeText(getApplicationContext(), statusCode + "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<EmergencyDataModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("Fail",t.getMessage());

            }
        });

    }
}
