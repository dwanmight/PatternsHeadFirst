package com.example.mvclib;

import com.example.mvclib.observable.Observable;
import com.example.mvclib.observable.Observer;

/**
 * Created by ilya on 08.02.2018.
 */

public class MallardDuck implements Quackable {
    private Observable mObservable;

    public MallardDuck() {
        mObservable = new Observable(this);
    }

    @Override public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override public void add(Observer observer) {
        mObservable.add(observer);
    }

    @Override public void notifyObservers() {
        mObservable.notifyObservers();
    }
}
