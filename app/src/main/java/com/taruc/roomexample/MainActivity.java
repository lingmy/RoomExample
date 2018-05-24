package com.taruc.roomexample;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare
    private EditText editTextEmail, editTextName,editTextGender;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all view UI
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextName=(EditText) findViewById(R.id.editName);
        editTextGender=(EditText) findViewById(R.id.editGender);
        buttonSave=(Button) findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(this);


    }

    public void onClick(View v){
        String email =editTextEmail.getText().toString();
        String name =editTextName.getText().toString();
        String gender =editTextGender.getText().toString();

        User user = new User(email,name,gender);

        //save into database

        MyAppDatabase db = Room.databaseBuilder(getApplicationContext(),
                            MyAppDatabase.class,"Users").
                            allowMainThreadQueries().build(); // getApplicationContext to get main content of the database
        db.myDao().addUser(user);
        startActivity(new Intent(MainActivity.this, RetrieveUsers.class));

    }

}
