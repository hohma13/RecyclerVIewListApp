package by.hohma13.recyclerviewlistapp.UI.View.Adapter;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import by.hohma13.recyclerviewlistapp.R;


public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private static final String TAG = "RecyclerViewHolder";
    private TextView itemRecyclerView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
        itemRecyclerView = itemView.findViewById(R.id.position);

    }

    public void bind(Integer integer) {
        itemRecyclerView.setText(integer.toString());
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
        return false;
    }
}
