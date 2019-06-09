package by.hohma13.recyclerviewlistapp.UI.View.Interface;

import java.util.ArrayList;

public interface RecyclerViewInterface {

    void setItems(ArrayList<Integer> list);
    void setItem(int item);
    int getItem(int item);
    ArrayList<Integer> getListRVA();
    void deleteItem(ArrayList<Integer> deleteNum);
//    void updateItem();
//    void deleteAllItems();

}
