package com.example.eunsik.mytdd;

/**
 * Created by Eunsik on 2017-08-24.
 */

class Stock {

    public String stockCode;
    public String name;
    public double currentPrice;
    public double priceDiff;
    public double rateDiff;
    public boolean isPriceUp;
    public boolean isPriceKeep;
    private int quantity;
    private double value;

    public Stock(String stockCode, String name, double currentPrice, double priceDiff, double rateDiff, boolean isPriceUp, boolean isPriceKeep) {
        this.stockCode = stockCode;
        this.name = name;
        this.currentPrice = currentPrice;
        this.priceDiff = priceDiff;
        this.rateDiff = rateDiff;
        this.isPriceUp = isPriceUp;
        this.isPriceKeep = isPriceKeep;
    }

    public String getStockCode() {
        return stockCode;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPriceDiff() {
        return priceDiff;
    }

    public double getRateDiff() {
        return rateDiff;
    }

    public boolean isPriceUp() {
        return isPriceUp;
    }

    public boolean isPriceKeep() {
        return isPriceKeep;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }
}
