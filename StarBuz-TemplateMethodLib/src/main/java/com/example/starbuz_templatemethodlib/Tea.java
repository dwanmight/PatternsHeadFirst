package com.example.starbuz_templatemethodlib;

/**
 * Created by ilya on 08.01.18.
 */

public class Tea extends CaffeineBeverage {

    @Override public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override public void addCondiments() {
        System.out.println("Adding lemon");
    }

}
