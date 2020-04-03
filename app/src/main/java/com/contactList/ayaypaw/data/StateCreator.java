package com.contactList.ayaypaw.data;

import com.contactList.ayaypaw.data_model.StateModel;

import java.util.ArrayList;

public class StateCreator {
    private static StateCreator stateCreator;
    public static StateCreator getInstance() {
        if(stateCreator == null){
            stateCreator = new StateCreator();
        }
        return stateCreator;
    }

    public ArrayList<StateModel> getAllStateList(){
        ArrayList<StateModel> stateList= new ArrayList<StateModel>();
        stateList.add(new StateModel("MMR001", "ကချင်ပြည်နယ်", "Kachin"));
        stateList.add(new StateModel("MMR002", "ကယားပြည်နယ်", "Kayah"));
        stateList.add(new StateModel("MMR003", "ကရင်ပြည်နယ်", "Kayin"));
        stateList.add(new StateModel("MMR004", "ချင်းပြည်နယ်", "Chin"));
        stateList.add(new StateModel("MMR005", "စစ်ကိုင်းတိုင်းဒေသကြီး", "Sagaing"));
        stateList.add(new StateModel("MMR006", "တနင်္သာရီတိုင်းဒေသကြီး", "Tanintharyi"));
        stateList.add(new StateModel("MMR007", "ပဲခူးတိုင်းဒေသကြီး (အရှေ့)", "Bago (East)"));
        stateList.add(new StateModel("MMR008", "ပဲခူးတိုင်းဒေသကြီး (အနောက်)", "Bago (West)"));
        stateList.add(new StateModel("MMR009", "မကွေးတိုင်းဒေသကြီး", "Magway"));
        stateList.add(new StateModel("MMR010", "မန္တလေးတိုင်းဒေသကြီး", "Mandalay"));
        stateList.add(new StateModel("MMR011", "မွန်ပြည်နယ်", "Mon"));
        stateList.add(new StateModel("MMR012", "ရခိုင်ပြည်နယ်", "Rakhine"));
        stateList.add(new StateModel("MMR014", "ရှမ်းပြည်နယ် (တောင်)", "Shan (South)"));
        stateList.add(new StateModel("MMR015", "ရှမ်းပြည်နယ် (မြောက်)", "Shan (North)"));
        stateList.add(new StateModel("MMR016", "ရှမ်းပြည်နယ် (အရှေ့)", "Shan (East)"));
        stateList.add(new StateModel("MMR017", "ဧရာဝတီတိုင်းဒေသကြီး", "Ayeyarwady"));
        stateList.add(new StateModel("MMR018", "နေပြည်တော်", "Nay Pyi Taw"));
        return stateList;
    }
}
