package com.example.doanlv4.databindingdemo.main;

import android.databinding.ObservableArrayList;
import android.view.View;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class UserListInfo {
    public ObservableArrayList<User> listUser = new ObservableArrayList<>();

    public UserListInfo() {
        addUserList();
    }

    private void addUserList() {
        listUser.add(new User("Khac","Bac"));
        listUser.add(new User("Phuong","Thao"));
        listUser.add(new User("Tao","Hung"));
        listUser.add(new User("Khac","Nam"));
        listUser.add(new User("Khac","Thuan"));
    }

    public void remove(View view) {
        if (!listUser.isEmpty()) {
            listUser.remove(listUser.size() - 1);
        }
    }
}
