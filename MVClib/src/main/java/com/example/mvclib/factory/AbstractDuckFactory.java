package com.example.mvclib.factory;

import com.example.mvclib.Quackable;

/**
 * Created by ilya on 10.02.2018.
 */

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
