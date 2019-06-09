package by.hohma13.recyclerviewlistapp.roomDB.mDAO;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import by.hohma13.recyclerviewlistapp.roomDB.mEntyti.NumbersEntity;

public interface DAOInterface {

    @Insert
    void insert(NumbersEntity numbersEntity);

    @Insert
    void update (NumbersEntity numbersEntity);

    @Insert
    void delete (NumbersEntity numbersEntity);

    @Query("SELECT * FROM NumbersEntity")
    List<NumbersEntity> getAll();

    @Query("SELECT * FROM NumbersEntity WHERE id = :id")
    NumbersEntity getById(long id);
}