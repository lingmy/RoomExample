package com.taruc.roomexample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by taruc on 23/5/2018.
 */
@Entity(tableName = "Users")
public class User {
    @PrimaryKey
    private String email;

    @ColumnInfo(name = "fullname")
    private String name;

    @ColumnInfo(name = "gender")
    private String gender;

    public User(String email, String name, String gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
