package com.example.pizzastorefactorylib;

import com.example.pizzastorefactorylib.ingredients.Cheese;
import com.example.pizzastorefactorylib.ingredients.Clams;
import com.example.pizzastorefactorylib.ingredients.Dough;
import com.example.pizzastorefactorylib.ingredients.Pepperoni;
import com.example.pizzastorefactorylib.ingredients.Sauce;
import com.example.pizzastorefactorylib.ingredients.Veggies;

/**
 * Created by ilya on 15.12.17.
 */

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
