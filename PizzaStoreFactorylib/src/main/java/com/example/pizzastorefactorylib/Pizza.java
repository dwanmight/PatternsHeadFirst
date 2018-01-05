package com.example.pizzastorefactorylib;

import com.example.pizzastorefactorylib.ingredients.Cheese;
import com.example.pizzastorefactorylib.ingredients.Clams;
import com.example.pizzastorefactorylib.ingredients.Dough;
import com.example.pizzastorefactorylib.ingredients.Pepperoni;
import com.example.pizzastorefactorylib.ingredients.Sauce;
import com.example.pizzastorefactorylib.ingredients.Veggies;

import java.util.ArrayList;

/**
 * Created by ilya on 14.12.17.
 */

public abstract class Pizza {
    String name;
    protected Dough mDough;
    protected Sauce mSauce;
    protected Pepperoni mPepperoni;
    protected Cheese mCheese;
    protected Clams mClams;
    protected Veggies[] mVeggies;

    public abstract void prepare();

    void bake() {
        System.out.println("bake for 25 min at 350 C");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
