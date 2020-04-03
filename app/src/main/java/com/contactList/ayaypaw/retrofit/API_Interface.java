package com.contactList.ayaypaw.retrofit;

import com.contactList.ayaypaw.model.EmergencyDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Interface { //Unicode // Sheet1
    @GET("ContactNoList!A1:J534?key=AIzaSyDynvdd6c9vUFyEd8So0wPHCY9XpjQ1vw4")
    Call<EmergencyDataModel> getAllContact();
}