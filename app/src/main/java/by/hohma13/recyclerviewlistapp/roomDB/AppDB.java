package by.hohma13.recyclerviewlistapp.roomDB;

import android.app.Application;
import android.arch.persistence.room.Room;

import by.hohma13.recyclerviewlistapp.roomDB.mDataBase.MDataBase;

public class AppDB extends Application {
    public static AppDB instance;

    private MDataBase mDataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mDataBase = Room.databaseBuilder(this, MDataBase.class, "numbers.db")
                .allowMainThreadQueries()
        .build();
    }

    public static AppDB getInstance(){return instance;}
    public MDataBase getmDataBase(){return mDataBase;}
}
