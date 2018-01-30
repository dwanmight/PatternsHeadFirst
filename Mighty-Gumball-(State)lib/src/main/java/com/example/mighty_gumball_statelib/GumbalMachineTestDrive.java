package com.example.mighty_gumball_statelib;

import com.example.mighty_gumball_statelib.states.GumballMachineNew;

/**
 * Created by ilya on 25.01.2018.
 */

public class GumbalMachineTestDrive {


    public static void main(String[] args) {
        GumballMachineNew gumballMachine = new GumballMachineNew(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.ejectQuarter();
    }
}
