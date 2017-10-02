package com.example.doanlv4.databindingdemo.second;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import com.example.doanlv4.databindingdemo.R;
import com.example.doanlv4.databindingdemo.databinding.AdapterSecondListviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class SecondListviewAdapter extends BaseAdapter implements Filterable{

    private ObservableArrayList<SinhVien> listSinhVien;
    private ObservableArrayList<SinhVien> svListFilter = new ObservableArrayList<>();
    private LayoutInflater inflater;

    public SecondListviewAdapter(ObservableArrayList<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
        svListFilter = listSinhVien;
    }

    public SecondListviewAdapter() {
    }

    @Override
    public int getCount() {
        return listSinhVien.size();
    }

    @Override
    public Object getItem(int position) {
        return listSinhVien.get(position);
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
        AdapterSecondListviewBinding binding = DataBindingUtil.getBinding(convertView);
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.adapter_second_listview,parent,false);
        }
        binding.setSinhvien(listSinhVien.get(position));
        return binding.getRoot();
    }

    public void setListSinhVien(ObservableArrayList<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
        svListFilter = listSinhVien;
    }

    @Override
    public Filter getFilter() {
        return new MyFilter();
    }


    private class MyFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint != null && constraint.length() > 0) {
                ObservableArrayList<SinhVien> filterList = new ObservableArrayList<SinhVien>();
                for (int i = 0; i < svListFilter.size(); i++) {
                    if ((svListFilter.get(i).getName().toUpperCase())
                            .contains(constraint.toString().toUpperCase())) {
                        SinhVien contacts = new SinhVien();
                        contacts.setName(svListFilter.get(i).getName());
                        contacts.setAge(svListFilter.get(i).getAge());
                        filterList.add(contacts);
                    }
                }
                results.count = filterList.size();
                results.values = filterList;
            } else {
                results.count = svListFilter.size();
                results.values = svListFilter;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            listSinhVien = (ObservableArrayList<SinhVien>) results.values;
            notifyDataSetChanged();
        }
    }


}


