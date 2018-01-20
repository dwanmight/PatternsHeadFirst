package com.example.menucollection_iterator_composerlib.p_iterator;

import com.example.menucollection_iterator_composerlib.p_iterator.Menu;
import com.example.menucollection_iterator_composerlib.p_iterator.MenuItem;

import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class WaitressWithCafe {
    Menu mPancakeHouseMenu;
    Menu mDinerMenu;
    Menu mCafeMenu;

    public WaitressWithCafe(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        mPancakeHouseMenu = pancakeHouseMenu;
        mDinerMenu = dinerMenu;
        mCafeMenu = cafeMenu;

    }

    public void printMenu() {
        Iterator panCakeIterator = mPancakeHouseMenu.createIterator();
        Iterator dinerIterator = mDinerMenu.createIterator();
        Iterator cafeIterator = mCafeMenu.createIterator();
        printMenu(panCakeIterator);
        System.out.println("\n next rest");
        printMenu(dinerIterator);
        System.out.println("\n next cafe");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iIterator) {
        while (iIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iIterator.next();
            System.out.println("\n " + menuItem.getName() + " desc" + menuItem.getDescription());
        }

    }
}
