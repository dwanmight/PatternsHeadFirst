package com.example.menucollection_iterator_composerlib.p_iterator;

import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class DinerMenu implements Menu {
    private static final int MAX_SIZE = 6;
    int numberOfItems = 0;
    MenuItem[] mMenuItems;

    public DinerMenu() {
        mMenuItems = new MenuItem[MAX_SIZE];
        addItem("Hot Dog", "Hot dog desc", false, 4.56);
        addItem("Burger", "Burger desc", false, 4.51);
    }

    void addItem(String name, String desc, boolean vegeterian, double price) {
        if (numberOfItems >= MAX_SIZE) {
            System.out.println("Error, Menu is full");
        } else {
            mMenuItems[numberOfItems] = new MenuItem(desc, name, vegeterian, price);
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return mMenuItems;
    }

//    public IIterator createIterator() {
//        return new DinerMenuIterator(mMenuItems);
//    }


    @Override public Iterator createIterator() {
        return new DinerMenuIteratorNew(mMenuItems);
    }
}
