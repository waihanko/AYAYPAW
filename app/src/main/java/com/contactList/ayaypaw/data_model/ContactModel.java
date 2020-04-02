package com.contactList.ayaypaw.data_model;

public class ContactModel {

    private String stateName,personName, personRole,townshipName, phoneNumberOne,responsibility,stateCode,
            townshipCode,department,phoneNumberTwo;

    public ContactModel(String stateName, String personName, String personRole, String townshipName,
                        String phoneNumberOne, String responsibility, String stateCode, String townshipCode,
                        String department, String phoneNumberTwo) {
        this.stateName = stateName;
        this.personName = personName;
        this.personRole = personRole;
        this.townshipName = townshipName;
        this.phoneNumberOne = phoneNumberOne;
        this.responsibility = responsibility;
        this.stateCode = stateCode;
        this.townshipCode = townshipCode;
        this.department = department;
        this.phoneNumberTwo = phoneNumberTwo;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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

    public String getPhoneNumberOne() {
        return phoneNumberOne;
    }

    public void setPhoneNumberOne(String phoneNumberOne) {
        this.phoneNumberOne = phoneNumberOne;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getTownshipCode() {
        return townshipCode;
    }

    public void setTownshipCode(String townshipCode) {
        this.townshipCode = townshipCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumberTwo() {
        return phoneNumberTwo;
    }

    public void setPhoneNumberTwo(String phoneNumberTwo) {
        this.phoneNumberTwo = phoneNumberTwo;
    }
}
