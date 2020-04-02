package com.contactList.ayaypaw.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "https://sheets.googleapis.com/v4/spreadsheets/1UmXfnox_8M11QBIKuReZlKnN1ppI9bWsYc1RLXNM7jg/values/";

    public static API_Interface getEmergencyContactList() {
        return RetrofitClient.getClient(BASE_URL).create(API_Interface.class);
    }

}