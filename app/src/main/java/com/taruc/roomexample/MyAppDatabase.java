package com.taruc.roomexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by taruc on 23/5/2018.
 */
@Database(entities={User.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase{

    public abstract MyDao myDao();

}
