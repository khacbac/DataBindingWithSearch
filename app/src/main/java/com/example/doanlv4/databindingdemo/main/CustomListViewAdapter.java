package com.example.doanlv4.databindingdemo.main;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.doanlv4.databindingdemo.R;
import com.example.doanlv4.databindingdemo.databinding.AdapterCustomListviewBinding;


import java.util.ArrayList;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class CustomListViewAdapter extends BaseAdapter {

    private ArrayList<User> listUser;
    private LayoutInflater inflater;

    public CustomListViewAdapter(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    @Override
    public int getCount() {
        return listUser.size();
    }

    @Override
    public Object getItem(int position) {
        return listUser.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        AdapterCustomListviewBinding listviewBinding = DataBindingUtil.getBinding(convertView);
        if (listviewBinding == null) {
            listviewBinding = DataBindingUtil
                    .inflate(inflater, R.layout.adapter_custom_listview,parent,false);
        }
        listviewBinding.setUser(listUser.get(position));
        return listviewBinding.getRoot();
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
        notifyDataSetChanged();
    }
}
