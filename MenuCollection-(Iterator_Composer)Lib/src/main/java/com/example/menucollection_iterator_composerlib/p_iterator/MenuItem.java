package com.example.menucollection_iterator_composerlib.p_iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class MenuItem {
    String description;
    String name;
    boolean vegeterian;
    double price;

    public MenuItem(String description, String name, boolean vegeterian, double price) {
        this.description = description;
        this.name = name;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public double getPrice() {
        return price;
    }
}
