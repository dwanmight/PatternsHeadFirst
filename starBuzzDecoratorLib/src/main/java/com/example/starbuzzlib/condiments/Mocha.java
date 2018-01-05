package com.example.starbuzzlib.condiments;

import com.example.starbuzzlib.Beverage;
import com.example.starbuzzlib.CondimentDecorator;

/**
 * Created by ilya on 13.12.17.
 */

public class Mocha extends CondimentDecorator {
    Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    @Override public double cost() {
        return 0.20 + mBeverage.cost();
    }
}
