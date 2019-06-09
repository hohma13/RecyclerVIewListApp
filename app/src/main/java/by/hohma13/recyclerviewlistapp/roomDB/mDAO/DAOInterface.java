package by.hohma13.recyclerviewlistapp.roomDB.mDAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import by.hohma13.recyclerviewlistapp.roomDB.mEntity.NumbersEntity;
import io.reactivex.Flowable;

@Dao
public interface DAOInterface {

    @Insert
    void insert (NumbersEntity numbersEntity);

    @Delete
    void delete (NumbersEntity numbersEntity);

    @Query("SELECT * FROM NumbersEntity")
    List<NumbersEntity> getAll();

    @Query("SELECT * FROM NumbersEntity WHERE id = :id")
    NumbersEntity getById(long id);

    @Query("SELECT * FROM NumbersEntity")
    Flowable<List<NumbersEntity>> getAllrx();
}
