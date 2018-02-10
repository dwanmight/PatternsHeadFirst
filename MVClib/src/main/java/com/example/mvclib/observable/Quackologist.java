package com.example.mvclib.observable;

/**
 * Created by ilya on 10.02.2018.
 */

public class Quackologist implements Observer {
    @Override public void update(QuackObservable duck) {
        System.out.println("Quackologist " + duck + " quacked");
    }
}
