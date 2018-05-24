package com.taruc.roomexample;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RetrieveUsers extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<User> adapter;
    List<User> users;
    ArrayList<String> result = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_users);

        listView = (ListView)findViewById(R.id.listView);

        MyAppDatabase db = Room.databaseBuilder(this, MyAppDatabase.class, "Users").allowMainThreadQueries().build();

        //allowMainThreadQueries    2 type- interface and background code
        //users is a list
       users= db.myDao().loadUser();
       // result.add(String.format("Email\t\t\t\t\t\t\t\t"+"Name\t\t\t\t\t\t\t\t"+"Gender"));
        result.add(String.format("%-20s%-20s%s","Email","Name","Gender"));
        for (int i = 0; i < users.size(); i++) {
            result.add(users.get(i).getEmail() +"\t\t\t\t"+ users.get(i).getName() +"\t\t\t\t"+ users.get(i).getGender());

        }

        adapter = new UserAdapter(RetrieveUsers.this,
                    R.layout.support_simple_spinner_dropdown_item,
                    result);

        listView.setAdapter(adapter);
    }
}
