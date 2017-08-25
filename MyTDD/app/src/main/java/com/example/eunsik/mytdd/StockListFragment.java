package com.example.eunsik.mytdd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Eunsik on 2017-08-25.
 */

public class StockListFragment extends ListFragment {
    private ArrayList<Stock> mStocks;

    public ArrayList<Stock> getStocks() {
        return mStocks;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStocks = new ArrayList<Stock>();
        mStocks = StockManager.get().getStocks();
        //mStocks.add(new Stock("00001", "삼성전자", 10000, 100, 10, true, false));
        // mStocks.add(new Stock("00002", "LG전자", 50000, 10, 1, false, false));

        ArrayAdapter<Stock> arrayAdapter = new ArrayAdapter<Stock>(getActivity(), android.R.layout.simple_list_item_1, mStocks);
        setListAdapter(arrayAdapter);
    }

    public void notifyDataSetChanged() {
        ((ArrayAdapter<Stock>) getListAdapter()).notifyDataSetChanged();
    }
}
