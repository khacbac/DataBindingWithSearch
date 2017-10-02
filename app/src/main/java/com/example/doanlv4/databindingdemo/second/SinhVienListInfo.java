package com.example.doanlv4.databindingdemo.second;

import android.databinding.ObservableArrayList;
import android.support.v7.widget.SearchView;
import android.util.Log;

import java.util.Random;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class SinhVienListInfo {
    private static final String TAG = SinhVienListInfo.class.getSimpleName();
    public ObservableArrayList<SinhVien> listSinhVien = new ObservableArrayList<>();
    public SecondListviewAdapter adapter;

    public SinhVienListInfo() {
        for (int i = 0; i < 20; i++) {
            listSinhVien.add(new SinhVien(i +"Sinh vien ", "Tuoi " + (i + 20)));
        }
        adapter = new SecondListviewAdapter();
    }

    public SecondListviewAdapter getAdapter() {
        return adapter;
    }

    public void onQueryTextListener(SearchView searchView) {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d(TAG, "onQueryTextSubmit: called");
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d(TAG, "onQueryTextChange: called");
                return false;
            }
        });
    }
}
