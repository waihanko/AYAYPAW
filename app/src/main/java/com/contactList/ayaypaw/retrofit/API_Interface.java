package com.contactList.ayaypaw.retrofit;

import com.contactList.ayaypaw.model.EmergencyDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Interface { //Unicode // Sheet1
    @GET("Sheet1!A1:J535?key=AIzaSyAQFhzGIMKrVfh38YX94I97cYTaaACKdqU")
    Call<EmergencyDataModel> getAllContact();
}