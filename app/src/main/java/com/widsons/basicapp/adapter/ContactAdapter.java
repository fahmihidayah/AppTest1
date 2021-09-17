package com.widsons.basicapp.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.widsons.basicapp.R;

import java.util.ArrayList;

/**
 * Created on : September/17/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<String> contacts = new ArrayList<>();

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        ContactViewHolder contactViewHolder = new ContactViewHolder(
                LayoutInflater
                        .from(parent
                                .getContext()).inflate(R.layout.contact_view_holder, parent)
        );
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.textViewContact.setText(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
