package by.hohma13.recyclerviewlistapp.UI.View.Adapter;



import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import by.hohma13.recyclerviewlistapp.R;
import by.hohma13.recyclerviewlistapp.minterface.mPresenterInterface;
import by.hohma13.recyclerviewlistapp.mpresenter.MPresenter;
import by.hohma13.recyclerviewlistapp.repository.MRepository;


public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{
    private static final String TAG = "RecyclerViewHolder";
    private TextView itemRecyclerView;
    private MRepository mRepository;
    private MPresenter mPresenter;
    RecyclerViewAdapter rva;
    private AdapterView.OnItemClickListener mItemClickListener;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnLongClickListener(this);
        mRepository = new MRepository();
        rva = new RecyclerViewAdapter();
        itemRecyclerView = itemView.findViewById(R.id.position);

    }

    public void bind(Integer integer) {
        itemRecyclerView.setText(integer.toString());
    }


    @Override
    public boolean onLongClick(View view) {

        int numForDel = Integer.parseInt(itemRecyclerView.getText().toString());
        //mPresenter.deleteListItem(numForDel);
        rva.deleteItem(mRepository.deleteItem(numForDel));
        return true;
    }

}
