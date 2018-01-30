package com.example.mighty_gumball_statelib;

/**
 * Created by ilya on 25.01.2018.
 */

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
