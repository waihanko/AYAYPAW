package com.contactList.ayaypaw.model;

import com.contactList.ayaypaw.data_model.ContactModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmergencyDataModel {

    @SerializedName("range")
    @Expose
    private String range;

    @SerializedName("majorDimension")
    @Expose
    private String majorDimension;

    ArrayList  values = new ArrayList();

    // Getter Methods
    public String getRange() {
        return range;
    }

    public ArrayList getValues() {
        return values;
    }

    public void setValues(ArrayList values) {
        this.values = values;
    }

    public String getMajorDimension() {
        return majorDimension;
    }

    // Setter Methods

    public void setRange( String range ) {
        this.range = range;
    }

    public void setMajorDimension( String majorDimension ) {
        this.majorDimension = majorDimension;
    }


}