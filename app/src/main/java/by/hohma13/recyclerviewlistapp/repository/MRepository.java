package by.hohma13.recyclerviewlistapp.repository;

import java.util.ArrayList;
import java.util.List;

import by.hohma13.recyclerviewlistapp.minterface.mRepositoryInterface;
import by.hohma13.recyclerviewlistapp.roomDB.AppDB;
import by.hohma13.recyclerviewlistapp.roomDB.mDAO.DAOInterface;
import by.hohma13.recyclerviewlistapp.roomDB.mDataBase.MDataBase;
import by.hohma13.recyclerviewlistapp.roomDB.mEntity.NumbersEntity;

public class MRepository implements mRepositoryInterface {
    private static final String TAG = "createDB";
    List<NumbersEntity> list;
    ArrayList<Integer> listInt;
    NumbersEntity numbersEntity;
    MDataBase mDataBase;
    DAOInterface daoInterface;


    public MRepository(){
        mDataBase = AppDB.getInstance().getmDataBase();
        daoInterface = mDataBase.daoInterface();
        numbersEntity = new NumbersEntity();
        if(daoInterface.getAll().size() == 0) {
            create();
        }
    }

    @Override
    public void create() {
        for(int i = 100; i>0;i--){
            numbersEntity.id = i;
            numbersEntity.numbers = i;
            daoInterface.insert(numbersEntity);
        }
    }

    @Override
    public ArrayList<Integer> getDB() {
        listInt = new ArrayList<>();
        list = daoInterface.getAll();
        for(int i = list.size()-1; i>=0;i--) {
            listInt.add(list.get(i).numbers);
        }
    return listInt;
    }

    @Override
    public ArrayList<Integer> addItem(int itemNew) {
        numbersEntity = daoInterface.getById(itemNew);
        ++numbersEntity.id;
        ++numbersEntity.numbers;
        daoInterface.insert(numbersEntity);
        return getDB();
    }

    @Override
    public ArrayList<Integer> deleteItem(int itemDel) {
        numbersEntity = daoInterface.getById(itemDel);
        daoInterface.delete(numbersEntity);
        return getDB();
    }

}
