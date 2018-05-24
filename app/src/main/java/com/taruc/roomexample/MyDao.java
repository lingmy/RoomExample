package com.taruc.roomexample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by taruc on 23/5/2018.
 */
@Dao
public interface MyDao {

   @Insert
   public void addUser(User user);

   @Query("Select * from Users")
   List<User> loadUser();




}
