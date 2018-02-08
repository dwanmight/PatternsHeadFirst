package com.example.mvclib;

/**
 * Created by ilya on 08.02.2018.
 */

public class DuckSimulatorWithDecorator {

    public static void main(String[] args) {
        DuckSimulatorWithDecorator duckSimulator = new DuckSimulatorWithDecorator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadQuack = new QuackCounter(new RedHeadQuack());
        Quackable callDuck = new QuackCounter(new CallDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck simulator with decorator");
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
