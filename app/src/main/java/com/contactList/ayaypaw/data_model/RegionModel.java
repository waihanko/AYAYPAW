package com.contactList.ayaypaw.data_model;

public class RegionModel {
    //"MMR001D003", "Bhamo", "MMR001010", "ဗန်းမော်", "Bhamo"
    String StateMMR, StateNameEng, TownshipMMR, TownshipNameMM, TownshipNameEng;

    public RegionModel(String stateMMR, String stateNameEng, String townshipMMR, String townshipNameMM, String townshipNameEng) {
        StateMMR = stateMMR;
        StateNameEng = stateNameEng;
        TownshipMMR = townshipMMR;
        TownshipNameMM = townshipNameMM;
        TownshipNameEng = townshipNameEng;
    }

    public String getStateMMR() {
        return StateMMR;
    }

    public String getStateNameEng() {
        return StateNameEng;
    }

    public String getTownshipMMR() {
        return TownshipMMR;
    }

    public String getTownshipNameMM() {
        return TownshipNameMM;
    }

    public String getTownshipNameEng() {
        return TownshipNameEng;
    }

    public void setStateMMR(String stateMMR) {
        StateMMR = stateMMR;
    }

    public void setStateNameEng(String stateNameEng) {
        StateNameEng = stateNameEng;
    }

    public void setTownshipMMR(String townshipMMR) {
        TownshipMMR = townshipMMR;
    }

    public void setTownshipNameMM(String townshipNameMM) {
        TownshipNameMM = townshipNameMM;
    }

    public void setTownshipNameEng(String townshipNameEng) {
        TownshipNameEng = townshipNameEng;
    }
}
