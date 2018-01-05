package com.example.pizzastorefactorylib.pizzas;

import com.example.pizzastorefactorylib.Pizza;
import com.example.pizzastorefactorylib.PizzaIngredientFactory;

/**
 * Created by ilya on 15.12.17.
 */

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory mPizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory factory) {
        mPizzaIngredientFactory = factory;
    }

    @Override public void prepare() {
        mDough = mPizzaIngredientFactory.createDough();
        mSauce = mPizzaIngredientFactory.createSauce();
        mCheese = mPizzaIngredientFactory.createCheese();
    }
}
