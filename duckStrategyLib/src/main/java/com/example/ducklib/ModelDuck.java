package com.example.ducklib;

/**
 * Created by ilya on 12.12.17.
 */

public class ModelDuck extends Duck{
    @Override public void display() {
        System.out.println("i`m a model duck");
    }

    public ModelDuck() {
        mFlyBehavior=new FlyNoWay();
        mQuackBehavior=new Quack();
    }
}
