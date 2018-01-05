package com.example.ducklib;

/**
 * Created by ilya on 11.12.17.
 */

public class Quack implements QuackBehavior {
    @Override public void quack() {
        System.out.println("quack");
    }
}
