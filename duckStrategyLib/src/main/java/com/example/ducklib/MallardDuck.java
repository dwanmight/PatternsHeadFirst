package com.example.ducklib;

/**
 * Created by ilya on 12.12.17.
 */

public class MallardDuck extends Duck {
    @Override public void display() {
        System.out.println("i`m real mallard duck");
    }

    public MallardDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }
}
