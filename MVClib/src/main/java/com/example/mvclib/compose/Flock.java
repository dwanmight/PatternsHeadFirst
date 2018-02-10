package com.example.mvclib.compose;

import com.example.mvclib.Quackable;
import com.example.mvclib.observable.Observable;
import com.example.mvclib.observable.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilya on 10.02.2018.
 */

public class Flock implements Quackable {
    private Observable mObservable;
    private ArrayList<Quackable> mQuackables = new ArrayList<>();

    public Flock() {
        mObservable = new Observable(this);
    }

    public void add(Quackable quackable) {
        mQuackables.add(quackable);
    }

    @Override public void quack() {
        Iterator<Quackable> iterator = mQuackables.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = mQuackables.iterator();
        while (iterator.hasNext()) {
            add(observer);
        }
    }

    @Override public void add(Observer observer) {
        mObservable.add(observer);
    }

    @Override public void notifyObservers() {
        mObservable.notifyObservers();
    }
}
