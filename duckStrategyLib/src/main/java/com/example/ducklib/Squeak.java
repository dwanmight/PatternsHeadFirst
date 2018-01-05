package com.example.ducklib;

/**
 * Created by ilya on 11.12.17.
 */

public class Squeak implements QuackBehavior {
    @Override public void quack() {
        System.out.println("squeak");
    }
}
