package by.hohma13.recyclerviewlistapp.UI.Activity;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import by.hohma13.recyclerviewlistapp.R;
import by.hohma13.recyclerviewlistapp.UI.View.Adapter.RecyclerViewAdapter;
import by.hohma13.recyclerviewlistapp.UI.View.Adapter.RecyclerViewHolder;
import by.hohma13.recyclerviewlistapp.minterface.mPresenterInterface;
import by.hohma13.recyclerviewlistapp.minterface.mViewInterface;
import by.hohma13.recyclerviewlistapp.mpresenter.MPresenter;

public class MainActivity extends AppCompatActivity implements mViewInterface, View.OnClickListener {

    private static final String SAVED_RECYCLER_VIEW_STATUS_ID = "statuId";
    private static final String SAVED_RECYCLER_VIEW_DATASET_ID = "datasetId";
    private static mPresenterInterface mPresenter;




    private FloatingActionButton fab;

    public RecyclerView recyclerView;
    public RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(by.hohma13.recyclerviewlistapp.R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        fab = findViewById(R.id.floatingActionButton);

        mPresenter = new MPresenter(this);

        if (savedInstanceState != null) {
            savedInstanceState.getParcelable(SAVED_RECYCLER_VIEW_STATUS_ID);
            mPresenter.listRestore(savedInstanceState.getIntegerArrayList(SAVED_RECYCLER_VIEW_DATASET_ID));
        } else {
            mPresenter.create();
        }
        fab.setOnClickListener(this);

    }
    public static void delete(ArrayList<Integer> list){
        mPresenter.listRestore(list);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Parcelable listState = recyclerView.getLayoutManager().onSaveInstanceState();
        outState.putParcelable(SAVED_RECYCLER_VIEW_STATUS_ID, listState);
        ArrayList<Integer> mArrayList = recyclerViewAdapter.getListRVA();
        outState.putIntegerArrayList(SAVED_RECYCLER_VIEW_DATASET_ID, mArrayList);
        super.onSaveInstanceState(outState);
    }
    @Override
    public void showList(ArrayList<Integer> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setItems(list);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.floatingActionButton:
                mPresenter.addListItem(recyclerViewAdapter.getItem(0));
                break;
        }
    }
}
