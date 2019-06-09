package by.hohma13.recyclerviewlistapp.minterface;

import java.util.ArrayList;

public interface mRepositoryInterface {
    void create();
    ArrayList<Integer> getDB();
    ArrayList<Integer> addItem(int itemNew);
    ArrayList<Integer> deleteItem(int itemDel);
}
