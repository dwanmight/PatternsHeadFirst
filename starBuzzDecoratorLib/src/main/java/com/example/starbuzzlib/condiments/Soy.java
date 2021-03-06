package com.example.starbuzzlib.condiments;

import com.example.starbuzzlib.Beverage;
import com.example.starbuzzlib.CondimentDecorator;

/**
 * Created by ilya on 13.12.17.
 */

public class Soy extends CondimentDecorator {
    Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override public String getDescription() {
        return mBeverage.getDescription() + ", Soy";
    }

    @Override public double cost() {
        return 0.15 + mBeverage.cost();
    }
}
