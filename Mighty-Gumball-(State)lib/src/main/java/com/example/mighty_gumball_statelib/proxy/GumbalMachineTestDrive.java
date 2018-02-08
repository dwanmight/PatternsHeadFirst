package com.example.mighty_gumball_statelib.proxy;

/**
 * Created by ilya on 25.01.2018.
 */

public class GumbalMachineTestDrive {


    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);

        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
