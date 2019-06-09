package by.hohma13.recyclerviewlistapp.roomDB.mEntity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class NumbersEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public int numbers;
}
