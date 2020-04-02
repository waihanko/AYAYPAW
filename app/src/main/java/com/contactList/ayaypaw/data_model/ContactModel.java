package com.contactList.ayaypaw.data_model;

public class ContactModel {

    private String stateName,personName, personRole,townshipName, phoneNumber;

    public ContactModel(String stateName, String personRole, String townshipName, String phoneNumber,String personName) {
        this.stateName = stateName;
        this.personRole = personRole;
        this.townshipName = townshipName;
        this.phoneNumber = phoneNumber;
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public String getTownshipName() {
        return townshipName;
    }

    public void setTownshipName(String townshipName) {
        this.townshipName = townshipName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
