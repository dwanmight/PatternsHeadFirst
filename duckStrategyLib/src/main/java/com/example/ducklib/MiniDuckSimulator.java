package com.example.ducklib;

/**
 * Created by ilya on 12.12.17.
 */

public class MiniDuckSimulator {

    public MiniDuckSimulator() {
        main(null);
    }

    public static void main(String [] args){
        Duck duck=new MallardDuck();
        duck.performFly();
        duck.performQuack();

        ModelDuck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
