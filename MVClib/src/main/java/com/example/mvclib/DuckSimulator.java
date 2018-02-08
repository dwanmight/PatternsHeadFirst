package com.example.mvclib;

/**
 * Created by ilya on 08.02.2018.
 */

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadQuack = new RedHeadQuack();
        Quackable callDuck = new CallDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck simulator");
        simulate(mallardDuck);
        simulate(redHeadQuack);
        simulate(callDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
