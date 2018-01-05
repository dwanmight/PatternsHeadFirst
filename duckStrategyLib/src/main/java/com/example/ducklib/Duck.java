package com.example.ducklib;

/**
 * Created by ilya on 11.12.17.
 */

public abstract class Duck {
    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks swimming!");
    }
}
