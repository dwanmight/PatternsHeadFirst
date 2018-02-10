package com.example.mvclib.observable;

/**
 * Created by ilya on 10.02.2018.
 */

public interface QuackObservable {

    void add(Observer observer);

    void notifyObservers();
}
