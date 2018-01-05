package com.example.pizzastorefactorylib.stores;

import com.example.pizzastorefactorylib.Pizza;

/**
 * Created by ilya on 14.12.17.
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
