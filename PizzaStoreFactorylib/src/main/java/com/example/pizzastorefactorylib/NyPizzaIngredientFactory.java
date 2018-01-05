package com.example.pizzastorefactorylib;

import com.example.pizzastorefactorylib.ingredients.Cheese;
import com.example.pizzastorefactorylib.ingredients.Clams;
import com.example.pizzastorefactorylib.ingredients.Dough;
import com.example.pizzastorefactorylib.ingredients.FreshClams;
import com.example.pizzastorefactorylib.ingredients.Garlic;
import com.example.pizzastorefactorylib.ingredients.MarinaraSauce;
import com.example.pizzastorefactorylib.ingredients.Mushroom;
import com.example.pizzastorefactorylib.ingredients.Onion;
import com.example.pizzastorefactorylib.ingredients.Pepperoni;
import com.example.pizzastorefactorylib.ingredients.RedPepper;
import com.example.pizzastorefactorylib.ingredients.ReggianoCheese;
import com.example.pizzastorefactorylib.ingredients.Sauce;
import com.example.pizzastorefactorylib.ingredients.SlicedPepperoni;
import com.example.pizzastorefactorylib.ingredients.ThinCrustDough;
import com.example.pizzastorefactorylib.ingredients.Veggies;

/**
 * Created by ilya on 15.12.17.
 */

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Mushroom(), new RedPepper(), new Garlic()};
    }

    @Override public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override public Clams createClam() {
        return new FreshClams();
    }
}
