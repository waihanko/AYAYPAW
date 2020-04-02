package com.contactList.ayaypaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.contactList.ayaypaw.data_model.ContactModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ContactModel> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ContactListAdapter contactListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.contact_list);

        contactListAdapter = new ContactListAdapter(contactList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(contactListAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        ContactModel contactModel = new ContactModel("Yangon", "General Manager", "Dagon","0978256478","PhyoeKo");
        contactList.add(contactModel);


         contactModel = new ContactModel("Yangon", "General Manager", "Dagon","0978256478","PhyoeKo");
        contactList.add(contactModel);


        contactModel = new ContactModel("Yangon", "General Manager", "Dagon","0978256478","PhyoeKo");
        contactList.add(contactModel);

         contactModel = new ContactModel("Yangon", "General Manager", "Dagon","0978256478","PhyoeKo");
        contactList.add(contactModel);




        contactListAdapter.notifyDataSetChanged();
    }
}
