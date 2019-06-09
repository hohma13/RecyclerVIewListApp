package by.hohma13.recyclerviewlistapp.roomDB.mDataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import by.hohma13.recyclerviewlistapp.roomDB.mDAO.DAOInterface;
import by.hohma13.recyclerviewlistapp.roomDB.mEntity.NumbersEntity;

@Database(entities = {NumbersEntity.class}, version = 1)
public abstract class MDataBase extends RoomDatabase {
    public abstract DAOInterface daoInterface();
}
