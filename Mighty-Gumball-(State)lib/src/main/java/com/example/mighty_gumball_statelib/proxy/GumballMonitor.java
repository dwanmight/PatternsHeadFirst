package com.example.mighty_gumball_statelib.proxy;

/**
 * Created by ilya on 06.02.2018.
 */

public class GumballMonitor {
    private GumballMachine mGumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball machine " + mGumballMachine.getLocation());
        System.out.println("Gumball inventory " + mGumballMachine.getCount() + " machine");
        System.out.println("Gumball state " + mGumballMachine.getState());
    }
}
