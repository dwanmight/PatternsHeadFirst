package com.example.starbuzzlib;

/**
 * Created by ilya on 13.12.17.
 */

public class Esspresso extends Beverage {

    public Esspresso() {
        description = "Espresso";

    }

    @Override public double cost() {
        return 1.99;
    }
}
