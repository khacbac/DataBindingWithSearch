package com.example.doanlv4.databindingdemo.second;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class SinhVienListBinder {

    @BindingAdapter(value = {"list","adapter"}, requireAll = true)
    public static void bindList(ListView listView, ObservableArrayList<SinhVien> list, SecondListviewAdapter adapter) {
//        SecondListviewAdapter adapter = new SecondListviewAdapter(list);
        adapter.setListSinhVien(list);
        listView.setAdapter(adapter);
    }
}
