package com.example.menucollection_iterator_composerlib.p_composer;

import java.util.Iterator;

/**
 * Created by ilya on 19.01.18.
 */

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegeterian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegeterian;
    }

    @Override public String getName() {
        return name;
    }

    @Override public String getDescription() {
        return description;
    }

    @Override public double getPrice() {
        return price;
    }

    @Override public boolean isVegetarian() {
        return vegetarian;
    }

    @Override public void print() {
        System.out.println(" "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(" , "+getPrice()+ " "+getDescription());
        System.out.println("");
    }

    @Override public Iterator createIterator() {
        return new NullIterator();
    }
}
