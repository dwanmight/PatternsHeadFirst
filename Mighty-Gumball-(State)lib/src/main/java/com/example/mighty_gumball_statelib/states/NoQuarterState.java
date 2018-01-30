package com.example.mighty_gumball_statelib.states;

import com.example.mighty_gumball_statelib.GumballMachine;
import com.example.mighty_gumball_statelib.State;

/**
 * Created by ilya on 25.01.2018.
 */

public class NoQuarterState implements State {
    GumballMachineNew mGumballMachine;

    public NoQuarterState(GumballMachineNew gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You inserted a quarter");
        mGumballMachine.setState(mGumballMachine.getHasQuarterState());
    }

    @Override public void ejectQuarter() {
        System.out.println("You haven`t inserted a quarter");
    }

    @Override public void turnCrank() {
        System.out.println("You turned but you there`s no quarter");
    }

    @Override public void dispense() {
        System.out.println("You need to pay first");
    }
}
