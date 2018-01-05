package com.example.starbuzzlib;

/**
 * Created by ilya on 13.12.17.
 */

public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
