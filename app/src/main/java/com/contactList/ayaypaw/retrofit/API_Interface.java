package com.contactList.ayaypaw.retrofit;

import com.contactList.ayaypaw.model.EmergencyDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Interface {
    @GET("Unicode!A2:B3?key=AIzaSyAQFhzGIMKrVfh38YX94I97cYTaaACKdqU")
    Call<List<EmergencyDataModel>> getAllContact();
}