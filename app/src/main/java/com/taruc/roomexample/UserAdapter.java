package com.taruc.roomexample;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taruc on 24/5/2018.
 */

public class UserAdapter extends ArrayAdapter {

       ArrayList<String> users;
//context refer to context is use
    public UserAdapter(@NonNull Context context, @LayoutRes int resource,  @NonNull List users) {
        super(context, resource, users);


    }
}
