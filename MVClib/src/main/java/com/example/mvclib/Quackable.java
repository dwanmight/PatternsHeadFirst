package com.example.mvclib;

import com.example.mvclib.observable.QuackObservable;

/**
 * Created by ilya on 08.02.2018.
 */

public interface Quackable extends QuackObservable {

    void quack();
}
