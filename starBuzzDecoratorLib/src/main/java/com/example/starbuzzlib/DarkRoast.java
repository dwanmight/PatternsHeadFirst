package com.example.starbuzzlib;

/**
 * Created by ilya on 13.12.17.
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark  Roast Coffee";

    }

    @Override public double cost() {
        return 0.99;
    }
}
