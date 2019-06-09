package by.hohma13.recyclerviewlistapp.mpresenter;

import java.util.ArrayList;


import by.hohma13.recyclerviewlistapp.minterface.mPresenterInterface;
import by.hohma13.recyclerviewlistapp.minterface.mRepositoryInterface;
import by.hohma13.recyclerviewlistapp.minterface.mViewInterface;
import by.hohma13.recyclerviewlistapp.repository.MRepository;

public class MPresenter implements mPresenterInterface {

    private mViewInterface mView;
    private mRepositoryInterface mRepositoryInterface;
    private ArrayList<Integer> list;

    public MPresenter(mViewInterface mView) {
        this.mView = mView;
        this.mRepositoryInterface = new MRepository();
    }

    @Override
    public void create() {
        list = mRepositoryInterface.getDB();
        mView.showList(list);
    }

    @Override
    public void addListItem(int itemId) {
        mView.showList(mRepositoryInterface.addItem(itemId));
    }

    @Override
    public void deleteListItem(int itemId) {
        mView.showList(mRepositoryInterface.deleteItem(itemId));
    }


    @Override
    public void listRestore(ArrayList<Integer> restoreList) {
        mView.showList(restoreList);
    }
}
