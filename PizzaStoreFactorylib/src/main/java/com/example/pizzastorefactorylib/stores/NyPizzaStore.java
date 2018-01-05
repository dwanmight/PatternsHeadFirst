package com.example.pizzastorefactorylib.stores;

import com.example.pizzastorefactorylib.NyPizzaIngredientFactory;
import com.example.pizzastorefactorylib.NyStyleCheesePizza;
import com.example.pizzastorefactorylib.Pizza;
import com.example.pizzastorefactorylib.PizzaIngredientFactory;
import com.example.pizzastorefactorylib.pizzas.CheesePizza;
import com.example.pizzastorefactorylib.pizzas.ClamPizza;

/**
 * Created by ilya on 14.12.17.
 */

public class NyPizzaStore extends PizzaStore {
    @Override protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NyPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName(" NY Style cheese pizza");
        }else if(type.equals("clam")){
            pizza=new ClamPizza(factory);
            pizza.setName("NY Style clam pizza");
        }
        return pizza;
    }
}
