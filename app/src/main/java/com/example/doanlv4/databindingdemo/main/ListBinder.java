package com.example.doanlv4.databindingdemo.main;

import android.databinding.BindingAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView listView, ArrayList<User> list) {
        CustomListViewAdapter adapter = new CustomListViewAdapter(list);
        listView.setAdapter(adapter);
    }
}
