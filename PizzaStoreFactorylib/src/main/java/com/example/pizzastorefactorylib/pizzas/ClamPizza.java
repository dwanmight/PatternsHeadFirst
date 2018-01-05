package com.example.pizzastorefactorylib.pizzas;

import com.example.pizzastorefactorylib.Pizza;
import com.example.pizzastorefactorylib.PizzaIngredientFactory;

/**
 * Created by ilya on 15.12.17.
 */

public class ClamPizza extends Pizza {
    PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override public void prepare() {
        mDough = factory.createDough();
        mSauce = factory.createSauce();
        mCheese = factory.createCheese();
        mClams = factory.createClam();
    }
}
