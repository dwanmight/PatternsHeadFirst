package com.example.mighty_gumball_statelib.states;

import com.example.mighty_gumball_statelib.State;

import java.util.Random;

/**
 * Created by ilya on 25.01.2018.
 */

public class HasQuarterState implements State {
    private Random mRandom = new Random(System.currentTimeMillis());
    GumballMachineNew mGumballMachine;

    public HasQuarterState(GumballMachineNew gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You can`t insert another quarter");
    }

    @Override public void ejectQuarter() {
        System.out.println("Quarter returned");
        mGumballMachine.setState(mGumballMachine.getNoQuarterState());
    }

    @Override public void turnCrank() {
        System.out.println("You turned ...");
        int winner = mRandom.nextInt(10);
        if ((winner == 0) && (mGumballMachine.getCount() > 1)) {
            mGumballMachine.setState(mGumballMachine.getWinnerState());
        } else {
            mGumballMachine.setState(mGumballMachine.getSoldState());
        }
    }

    @Override public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
