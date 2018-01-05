package com.example.ducklib;

/**
 * Created by ilya on 11.12.17.
 */

public class FlyNoWay implements FlyBehavior {
    @Override public void fly() {
        System.out.println("i`m no fly");
    }
}
