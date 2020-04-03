package com.contactList.ayaypaw.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "https://sheets.googleapis.com/v4/spreadsheets/1ST4rk-OtEGQljoJYF_y7QoQPcoJ0aK4_87jhnK6oSI8/values/";

    public static API_Interface getEmergencyContactList() {
        return RetrofitClient.getClient(BASE_URL).create(API_Interface.class);
    }

}