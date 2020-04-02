package com.contactList.ayaypaw.model;

import java.util.ArrayList;

public class EmergencyDataModel {
    private String range;
    private String majorDimension;
    ArrayList <Object> values = new ArrayList<Object>();

    // Getter Methods
    public String getRange() {
        return range;
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