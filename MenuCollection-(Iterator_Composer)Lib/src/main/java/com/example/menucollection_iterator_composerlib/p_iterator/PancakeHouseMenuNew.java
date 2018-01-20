package com.example.menucollection_iterator_composerlib.p_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class PancakeHouseMenuNew implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenuNew() {
        menuItems = new ArrayList();
        addItem("Waffles", "Waffles desc", true, 3.59);
        addItem("BlueBerry Pancake", "BlueBerry Pancake desc", true, 2.64);


    }

    void addItem(String name, String desc, boolean vegeterian, double price) {
        menuItems.add(new MenuItem(desc, name, vegeterian, price));
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

   @Override public Iterator createIterator() {
        return menuItems.iterator();
    }
}
