package com.example.starbuzzlib;

/**
 * Created by ilya on 13.12.17.
 */

public class DeCaf extends Beverage {

    public DeCaf() {
        description="DeCaf Coffee";
    }

    @Override public double cost() {
        return 1.05;
    }
}
