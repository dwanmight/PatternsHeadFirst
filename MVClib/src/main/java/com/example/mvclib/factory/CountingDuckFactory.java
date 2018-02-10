package com.example.mvclib.factory;

import com.example.mvclib.CallDuck;
import com.example.mvclib.MallardDuck;
import com.example.mvclib.QuackCounter;
import com.example.mvclib.Quackable;
import com.example.mvclib.RedHeadQuack;
import com.example.mvclib.RubberDuck;

/**
 * Created by ilya on 10.02.2018.
 */

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadQuack());
    }

    @Override public Quackable createDuckCall() {
        return new QuackCounter(new CallDuck());
    }

    @Override public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
