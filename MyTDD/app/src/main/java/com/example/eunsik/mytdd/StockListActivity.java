package com.example.eunsik.mytdd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Eunsik on 2017-08-25.
 */

public class StockListActivity extends SingleFragmentActivity {
    public StockListFragment stockListFragment;

    protected Fragment createFragment() {
        stockListFragment = new StockListFragment();
        return stockListFragment;
    }

}
