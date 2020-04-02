package com.contactList.ayaypaw;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.contactList.ayaypaw.data_model.ContactModel;

import java.util.List;


public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.MyViewHolder> {

    private List<ContactModel> contactModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView stateName, personName, personRole,phoneNumber,townshipName;

        public MyViewHolder(View view) {
            super(view);
            stateName = (TextView) view.findViewById(R.id.stateName);
            personName = (TextView) view.findViewById(R.id.personName);
            personRole = (TextView) view.findViewById(R.id.personRole);
            phoneNumber = (TextView) view.findViewById(R.id.phoneNumber);
            townshipName = (TextView) view.findViewById(R.id.townshipName);

        }
    }


    public ContactListAdapter(List<ContactModel> moviesList) {
        this.contactModelList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ContactModel contactModel = contactModelList.get(position);
        holder.stateName.setText(contactModel.getStateName());
        holder.personName.setText(contactModel.getPersonName());
        holder.personRole.setText(contactModel.getPersonRole());
        holder.phoneNumber.setText(contactModel.getPhoneNumberOne());
        holder.townshipName.setText(contactModel.getTownshipName());
    }

    @Override
    public int getItemCount() {
        return contactModelList.size();
    }
}