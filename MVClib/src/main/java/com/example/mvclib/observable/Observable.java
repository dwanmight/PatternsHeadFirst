package com.example.mvclib.observable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilya on 10.02.2018.
 */

public class Observable implements QuackObservable {
    ArrayList mObservers = new ArrayList();
    private QuackObservable mDuck;

    public Observable(QuackObservable duck) {
        mDuck = duck;
    }

    @Override public void add(Observer observer) {
        mObservers.add(observer);
    }

    @Override public void notifyObservers() {
        Iterator iterator = mObservers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(mDuck);
        }
    }
}
