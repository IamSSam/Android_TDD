package com.example.eunsik.mytdd;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.ListFragment;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertThat;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
/**
 * Created by Eunsik on 2017-08-25.
 */

public class StockListActivityTest {
    StockListActivity activity;
    // test할 액티비티 정하기
    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(StockListActivity.class);

    @Before
    public void setUp() {
        activity = (StockListActivity) mActivityRule.getActivity();
    }

    @After
    public void teardown() {
        StockManager.get().getStocks().clear();
    }

    @Test
    public void activity_should_have_fragment() {
        Assert.assertNotNull(activity.stockListFragment);
    }

    @Test
    public void fragment_should_be_list_fragment() {
        //Assert.assertThat(activity.stockListFragment, instanceof (ListFragment.class));
        Assert.assertTrue(activity.stockListFragment instanceof ListFragment);
    }

    @Test
    public void fragment_sholud_have_listview() {
        Assert.assertNotNull(activity.stockListFragment.getListView());
    }

    @Test
    public void listview_count_zero() {
        Assert.assertEquals(0, activity.stockListFragment.getListView().getCount());
    }

    @Test
    public void fragment_should_have_stocks() {
        Assert.assertEquals(0, activity.stockListFragment.getStocks().size());
    }

    @Test
    public void listview_should_reflect_stocks() {
        Assert.assertEquals(0, activity.stockListFragment.getListView().getCount());
        Stock stock = new Stock("00001", "삼성전자", 10000, 100, 10, true, false);
        activity.stockListFragment.getStocks().add(stock);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                activity.stockListFragment.notifyDataSetChanged();
            }
        });
        Assert.assertEquals(1, activity.stockListFragment.getListView().getCount());
    }

}
