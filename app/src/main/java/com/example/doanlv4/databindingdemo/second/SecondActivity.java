package com.example.doanlv4.databindingdemo.second;

import android.databinding.DataBindingUtil;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.doanlv4.databindingdemo.R;
import com.example.doanlv4.databindingdemo.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{

    private static final String TAG = SecondActivity.class.getSimpleName();
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second);
        binding.setInfos(new SinhVienListInfo());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_main, menu);

        final MenuItem searchItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);
//        binding.getInfos().onQueryTextListener(searchView);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d(TAG, "onQueryTextSubmit: called");
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.d(TAG, "onQueryTextChange: called");
        binding.getInfos().getAdapter().getFilter().filter(newText);
        return true;
    }

}
