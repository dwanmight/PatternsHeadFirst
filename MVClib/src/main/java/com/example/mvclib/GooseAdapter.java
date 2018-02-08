package com.example.mvclib;

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
}
