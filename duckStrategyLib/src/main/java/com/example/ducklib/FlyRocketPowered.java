package com.example.ducklib;

/**
 * Created by ilya on 12.12.17.
 */

public class FlyRocketPowered implements FlyBehavior {
    @Override public void fly() {
        System.out.println("i`m flying with a rocket ");
    }
}
