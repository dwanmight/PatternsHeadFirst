package com.example.mvclib;

import com.example.mvclib.observable.Observer;

/**
 * Created by ilya on 08.02.2018.
 */

public class GooseAdapter implements Quackable {
    private Goose mGoose;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
    }

    @Override public void quack() {
        mGoose.honk();
    }

    @Override public void add(Observer observer) {

    }

    @Override public void notifyObservers() {

    }
}
