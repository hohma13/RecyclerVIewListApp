package by.hohma13.recyclerviewlistapp.minterface;

import java.util.ArrayList;

public interface mRepositoryInterface {
    void getDB();
    void setDB();
    ArrayList<Integer> getDBList();
    int addItem(int itemNew);
    void deleteAllTable();
}
