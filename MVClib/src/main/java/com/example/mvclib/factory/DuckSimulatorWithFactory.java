package com.example.mvclib.factory;

import com.example.mvclib.Goose;
import com.example.mvclib.GooseAdapter;
import com.example.mvclib.QuackCounter;
import com.example.mvclib.Quackable;

/**
 * Created by ilya on 08.02.2018.
 */

public class DuckSimulatorWithFactory {

    public static void main(String[] args) {
        DuckSimulatorWithFactory duckSimulator = new DuckSimulatorWithFactory();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadQuack = duckFactory.createRedHeadDuck();
        Quackable callDuck = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck simulator with factory");
        simulate(mallardDuck);
        simulate(redHeadQuack);
        simulate(callDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("Quacked " + QuackCounter.getNumberOfQuaks() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
