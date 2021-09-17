package com.widsons.basicapp.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.widsons.basicapp.R;

/**
 * Created on : September/17/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : BasicApp
 */
public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView textViewContact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewContact = itemView.findViewById(R.id.textViewContact);
    }

}
