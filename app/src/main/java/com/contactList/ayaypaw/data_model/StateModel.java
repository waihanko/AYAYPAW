package com.contactList.ayaypaw.data_model;

public class StateModel {
    String StateMMR, StateNameMM, StateNameEng;

    public StateModel(String stateMMR, String stateNameMM, String stateNameEng) {
        StateMMR = stateMMR;
        StateNameMM = stateNameMM;
        StateNameEng = stateNameEng;
    }

    public String getStateMMR() {
        return StateMMR;
    }

    public String getStateNameMM() {
        return StateNameMM;
    }

    public String getStateNameEng() {
        return StateNameEng;
    }

    public void setStateMMR(String stateMMR) {
        StateMMR = stateMMR;
    }
}
