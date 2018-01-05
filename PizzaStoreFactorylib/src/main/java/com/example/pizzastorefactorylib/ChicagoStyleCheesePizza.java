package com.example.pizzastorefactorylib;

/**
 * Created by ilya on 14.12.17.
 */

public abstract class ChicagoStyleCheesePizza extends Pizza {
    // TODO: 15.12.17

    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
//        dough = "Extra thick crust dough";
//        sauce="Plum tomato sauce";
//        toppings.add("Shredder mozzarella cheese");
    }

    @Override void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
