package by.hohma13.recyclerviewlistapp.UI.View.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import by.hohma13.recyclerviewlistapp.UI.View.Interface.RecyclerViewInterface;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> implements RecyclerViewInterface {

    private ArrayList<Integer> listRVADB = new ArrayList<>();

    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(by.hohma13.recyclerviewlistapp.R.layout.list_item_view,viewGroup,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder RecyclerViewHolder, int position) {
        RecyclerViewHolder.bind(listRVADB.get(position));
    }

    @Override
    public int getItemCount() {
        return listRVADB.size();
    }

    @Override
    public void setItems(ArrayList<Integer> list) {
        listRVADB.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void setItem(int item) {
        listRVADB.add(0,item);
        notifyDataSetChanged();
    }

    @Override
    public int getItem(int item) {
        return listRVADB.get(item);
    }

    @Override
    public ArrayList<Integer> getListRVA() {
        return listRVADB;
    }

}
