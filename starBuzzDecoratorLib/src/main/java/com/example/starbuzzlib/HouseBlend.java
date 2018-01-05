package com.example.starbuzzlib;

/**
 * Created by ilya on 13.12.17.
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override public double cost() {
        return 0.89;
    }
}
