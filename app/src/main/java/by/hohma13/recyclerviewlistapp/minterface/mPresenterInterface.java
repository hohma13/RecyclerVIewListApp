package by.hohma13.recyclerviewlistapp.minterface;

import java.util.ArrayList;

public interface mPresenterInterface {
    void create();
    void addListItem(int itemId);
    void deleteListItem(int itemId);
    void deleteAll();
    void listRestore(ArrayList<Integer> integerArrayList);
}
