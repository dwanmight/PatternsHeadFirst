package com.example.pizzastorefactorylib;

import com.example.pizzastorefactorylib.stores.ChicagoPizzaStore;
import com.example.pizzastorefactorylib.stores.NyPizzaStore;
import com.example.pizzastorefactorylib.stores.PizzaStore;

public class myClass {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joe ordered " + pizza.getName() + "\n");
    }
}
