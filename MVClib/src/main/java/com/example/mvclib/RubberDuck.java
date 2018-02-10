package com.example.mvclib;

import com.example.mvclib.observable.Observer;

/**
 * Created by ilya on 08.02.2018.
 */

public class RubberDuck implements Quackable {
    @Override public void quack() {
        System.out.println("Squeak");
    }

    @Override public void add(Observer observer) {

    }

    @Override public void notifyObservers() {

    }
}
