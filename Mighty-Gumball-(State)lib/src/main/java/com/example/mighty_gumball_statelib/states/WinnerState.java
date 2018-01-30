package com.example.mighty_gumball_statelib.states;

import com.example.mighty_gumball_statelib.State;

/**
 * Created by ilya on 27.01.2018.
 */

public class WinnerState implements State {
    private GumballMachineNew mGumballMachinel;

    public WinnerState(GumballMachineNew gumballMachinel) {
        mGumballMachinel = gumballMachinel;
    }

    @Override public void insertQuarter() {
        System.out.println("Please wait, we`re already giving you a gumball");
    }

    @Override public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override public void turnCrank() {
        System.out.println("You turned ...");
    }

    @Override public void dispense() {
        System.out.println("You`re WINNER! You get two gumballs");
        mGumballMachinel.releaseBall();
        if (mGumballMachinel.getCount() == 0) {
            System.out.println("Oops, out of gumballs");
            mGumballMachinel.setState(mGumballMachinel.getSoldOutState());
        } else {
            mGumballMachinel.releaseBall();
            if(mGumballMachinel.getCount()>0){
                System.out.println("A gumball comes rolling out the slot");
                mGumballMachinel.setState(mGumballMachinel.getNoQuarterState());
            }else {
                System.out.println("Oops, out of gumballs");
                mGumballMachinel.setState(mGumballMachinel.getSoldOutState());
            }

        }
    }
}
