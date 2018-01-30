package com.example.mighty_gumball_statelib.states;

import com.example.mighty_gumball_statelib.State;

/**
 * Created by ilya on 24.01.2018.
 */

public class GumballMachineNew {
    private State mSoldState;
    private State mSoldOutState;
    private State mNoQuarterState;
    private State mHasQuarterState;
    private State mWinnerState;

    State state = mSoldOutState;
    int count = 0;

    public GumballMachineNew(int count) {
        this.count = count;
        mNoQuarterState = new NoQuarterState(this);
        mSoldOutState = new SoldOutState(this);
        mSoldState = new SoldState(this);
        mHasQuarterState = new HasQuarterState(this);
        mWinnerState = new WinnerState(this);
        if (count > 0) {
            state = mNoQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public void refill(int count){
        this.count+=count;
        state=mNoQuarterState;

    }

    public int getCount() {
        return count;
    }

    public State getHasQuarterState() {
        return mHasQuarterState;
    }

    public State getNoQuarterState() {
        return mNoQuarterState;
    }

    public State getSoldState() {
        return mSoldState;
    }

    public State getSoldOutState() {
        return mSoldOutState;
    }

    public State getWinnerState() {
        return mWinnerState;
    }
}
