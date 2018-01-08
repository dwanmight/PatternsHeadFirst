package com.example.starbuz_templatemethodlib;

/**
 * Created by ilya on 08.01.18.
 */

public class Coffee extends CaffeineBeverage {

    @Override public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override public void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
