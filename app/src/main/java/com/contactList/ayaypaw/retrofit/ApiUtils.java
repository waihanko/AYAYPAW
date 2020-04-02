package com.contactList.ayaypaw.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "https://sheets.googleapis.com/v4/spreadsheets/1PxUXhNiFLkCMXI1swB6S38VMRTbHNVXAsZ2l5B3rA2c/values/";

    public static API_Interface getEmergencyContactList() {
        return RetrofitClient.getClient(BASE_URL).create(API_Interface.class);
    }

}