package com.example.doanlv4.databindingdemo.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.doanlv4.databindingdemo.R;
import com.example.doanlv4.databindingdemo.databinding.ActivityMainBinding;
import com.example.doanlv4.databindingdemo.second.SecondActivity;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = MainActivity.class.getSimpleName();
    private CustomListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserListInfo info = new UserListInfo();
        binding.setUserInfos(info);

        startActivity(new Intent(MainActivity.this, SecondActivity.class));
//        ArrayList<User> listUser = new ArrayList<>();
//        listUser.add(new User("Khac","Bac"));
//        listUser.add(new User("Phuong","Thao"));
//        listUser.add(new User("Tao","Hung"));
//
//        listViewAdapter = new CustomListViewAdapter(listUser,this);
//        binding.listView.setAdapter(listViewAdapter);
    }

}
