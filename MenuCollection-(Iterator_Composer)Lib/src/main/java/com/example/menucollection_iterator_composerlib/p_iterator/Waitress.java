package com.example.menucollection_iterator_composerlib.p_iterator;

import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class Waitress {
    Menu mPancakeHouseMenu;
    Menu mDinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        mPancakeHouseMenu = pancakeHouseMenu;
        mDinerMenu = dinerMenu;

    }

    public void printMenu() {
        Iterator panCakeIterator = mPancakeHouseMenu.createIterator();
        Iterator dinerIterator = mDinerMenu.createIterator();
        printMenu(panCakeIterator);
        System.out.println("\n next rest");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iIterator) {
        while (iIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iIterator.next();
            System.out.println("\n " + menuItem.getName() + " desc" + menuItem.getDescription());
        }

    }
}
