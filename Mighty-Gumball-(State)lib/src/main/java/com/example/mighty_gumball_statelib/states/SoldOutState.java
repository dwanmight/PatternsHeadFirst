package com.example.mighty_gumball_statelib.states;

import com.example.mighty_gumball_statelib.State;

/**
 * Created by ilya on 25.01.2018.
 */

public class SoldOutState implements State {
    private GumballMachineNew mGumballMachine;

    public SoldOutState(GumballMachineNew gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You can`t insert a quarter the machine is sold out");
    }

    @Override public void ejectQuarter() {
        System.out.println("You can`t eject, you haven`t inserted a quarter");
    }

    @Override public void turnCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
