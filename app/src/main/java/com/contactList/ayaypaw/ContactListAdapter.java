package com.contactList.ayaypaw;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.contactList.ayaypaw.data_model.ContactModel;

import java.util.ArrayList;
import java.util.List;


public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.MyViewHolder> {

    public static List<ContactModel> contactModelList;
    public static List<ContactModel> contactListFiltered = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView stateName, personName, personRole, phoneNumber, departmentName,tv_responsibility;
        private LinearLayout lv_phoneNumber1, lv_phoneNumber2;

        private MyViewHolder(View view) {
            super(view);
            stateName = (TextView) view.findViewById(R.id.stateName);
            personName = (TextView) view.findViewById(R.id.personName);
            personRole = (TextView) view.findViewById(R.id.personRole);
            phoneNumber = (TextView) view.findViewById(R.id.phoneNumber);
            tv_responsibility = (TextView) view.findViewById(R.id.responsibility);
            departmentName = (TextView) view.findViewById(R.id.departmentName);
            lv_phoneNumber1 = (LinearLayout) view.findViewById(R.id.lv_phNo1);
            lv_phoneNumber2 = (LinearLayout) view.findViewById(R.id.lv_phNo2);

        }
    }


    public ContactListAdapter(List<ContactModel> moviesList) {
        this.contactModelList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list_row_sample, parent, false);

        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ContactModel contactModel = contactModelList.get(position);
//        ContactModel contactModel = contactModelList.get(position + 1);
        String contactNo = "";
        Long phone1 = 0L, phone2 = 0L;

        if (!contactModel.getPhoneNumberOne().equals("null")) {
            try {
                phone1 = Long.parseLong(contactModel.getPhoneNumberOne().replaceAll("\\s+", "").trim());
            } catch (Exception e) {
                phone1 = Long.parseLong("0");
            }
            contactNo = contactModel.getPhoneNumberOne();
        }

        if (!contactModel.getPhoneNumberTwo().equals("null")) {
            try {
                phone2 = Long.parseLong(contactModel.getPhoneNumberTwo().replaceAll("\\s+", "").trim());
            } catch (Exception e) {
                phone2 = Long.parseLong("0");
            }
            contactNo += ", " + contactModel.getPhoneNumberTwo();

        }

        final Long finalPhone1 = phone1;
        holder.lv_phoneNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callPhone(view, finalPhone1);
            }
        });

        final Long finalPhone2 = phone2;
        holder.lv_phoneNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callPhone(view, finalPhone2);
            }
        });

        holder.personName.setText(contactModel.getPersonName());
        holder.personRole.setText(contactModel.getPersonRole());
        holder.stateName.setText(contactModel.getStateName() + " -- " + contactModel.getTownshipName());
        holder.phoneNumber.setText(contactNo);
        holder.departmentName.setText(contactModel.getDepartment());
        holder.tv_responsibility.setText("("+ contactModel.getResponsibility() +")");
    }

    private void callPhone(View v, Long phNo) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + "0" + phNo));//change the number
        if (ActivityCompat.checkSelfPermission(v.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        v.getContext().startActivity(callIntent);
    }

    @Override
    public int getItemCount() {
        return contactModelList.size();
    }


    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    contactListFiltered = contactModelList;
                } else {
                    List<ContactModel> filteredList = new ArrayList<>();
                    for (ContactModel row : contactModelList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getStateCode().toLowerCase().contains(charString.toLowerCase())||
                                row.getStateName().toLowerCase().contains(charString.toLowerCase()) ||
                                row.getTownshipName().toLowerCase().contains(charString.toLowerCase()) ||
                                row.getPersonName().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    contactListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = contactListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                contactListFiltered = (ArrayList<ContactModel>) filterResults.values;
                contactModelList = contactListFiltered;
                Log.i("SEARCH",contactModelList.size()+"");
                notifyDataSetChanged();
            }

        };
    }

}