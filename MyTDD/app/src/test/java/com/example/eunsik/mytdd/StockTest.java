package com.example.eunsik.mytdd;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Eunsik on 2017-08-24.
 */

public class StockTest {
    @Test
    public void storck_init_setFields() {
        Stock stock = new Stock("0001", "삼성전자", 10000, 100, 10, true, false);
        Assert.assertNotNull(stock);
        Assert.assertEquals("0001", stock.stockCode);
        Assert.assertEquals("삼성전자", stock.name);
        Assert.assertEquals(10000, stock.currentPrice);
        Assert.assertEquals(100, stock.priceDiff);
        Assert.assertEquals(10, stock.rateDiff);
        Assert.assertEquals(true, stock.isPriceUp);
        Assert.assertEquals(false, stock.isPriceKeep);
    }
}
