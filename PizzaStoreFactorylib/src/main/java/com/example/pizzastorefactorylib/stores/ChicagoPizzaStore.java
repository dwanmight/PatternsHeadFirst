package com.example.pizzastorefactorylib.stores;

import com.example.pizzastorefactorylib.ChicagoStyleCheesePizza;
import com.example.pizzastorefactorylib.Pizza;

/**
 * Created by ilya on 14.12.17.
 */

public class ChicagoPizzaStore extends PizzaStore {
    @Override protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
//            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
