package com.example.mvclib.factory;

import com.example.mvclib.CallDuck;
import com.example.mvclib.MallardDuck;
import com.example.mvclib.Quackable;
import com.example.mvclib.RedHeadQuack;
import com.example.mvclib.RubberDuck;

/**
 * Created by ilya on 10.02.2018.
 */

public class DuckFactory extends AbstractDuckFactory {
    @Override public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override public Quackable createRedHeadDuck() {
        return new RedHeadQuack();
    }

    @Override public Quackable createDuckCall() {
        return new CallDuck();
    }

    @Override public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
