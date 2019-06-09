package by.hohma13.recyclerviewlistapp.roomDB.mDAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import by.hohma13.recyclerviewlistapp.roomDB.mEntity.NumbersEntity;


@Dao
public interface DAOInterface {

    @Insert
    void insert (NumbersEntity numbersEntity);

    @Insert
    void inserList(List<NumbersEntity> numbersEntities);

    @Delete
    void delete (NumbersEntity numbersEntity);

    @Update
    void update (NumbersEntity numbersEntity);

    @Query("SELECT * FROM NumbersEntity")
    List<NumbersEntity> getAll();

    @Query("SELECT * FROM NumbersEntity WHERE id = :id")
    NumbersEntity getById(long id);

}
