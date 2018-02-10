package com.example.mvclib;

import com.example.mvclib.compose.Flock;
import com.example.mvclib.factory.AbstractDuckFactory;
import com.example.mvclib.factory.CountingDuckFactory;

/**
 * Created by ilya on 08.02.2018.
 */

public class DuckSimulatorWithCompose {

    public static void main(String[] args) {
        DuckSimulatorWithCompose duckSimulator = new DuckSimulatorWithCompose();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadQuack = duckFactory.createRedHeadDuck();
        Quackable callDuck = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck simulator with compose");

        Flock flockOfDuck=new Flock();
        flockOfDuck.add(redHeadQuack);
        flockOfDuck.add(callDuck);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        Flock mallardFlock=new Flock();
        mallardFlock.add(mallardDuckOne);
        mallardFlock.add(mallardDuckTwo);
        mallardFlock.add(mallardDuckThree);
        mallardFlock.add(mallardDuckFour);

        flockOfDuck.add(mallardFlock);

        simulate(flockOfDuck);


        System.out.println("Quacked " + QuackCounter.getNumberOfQuaks() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
