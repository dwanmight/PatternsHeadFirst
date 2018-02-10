package com.example.mvclib;

import com.example.mvclib.observable.Observer;

/**
 * Created by ilya on 08.02.2018.
 */

public class QuackCounter implements Quackable {
    private Quackable mQuackable;
    private static int numberOfQuaks;

    public QuackCounter(Quackable quackable) {
        mQuackable = quackable;
    }

    @Override public void quack() {
        mQuackable.quack();
        numberOfQuaks++;
    }

    public static int getNumberOfQuaks() {
        return numberOfQuaks;
    }

    @Override public void add(Observer observer) {

    }

    @Override public void notifyObservers() {

    }
}
