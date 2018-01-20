package com.example.menucollection_iterator_composerlib.p_iterator;

import com.example.menucollection_iterator_composerlib.p_iterator.DinerMenuIteratorNew;
import com.example.menucollection_iterator_composerlib.p_iterator.Menu;
import com.example.menucollection_iterator_composerlib.p_iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class CafeMenu implements Menu {
    Hashtable mMenuItems;

    public CafeMenu() {
        mMenuItems = new Hashtable<>();
        addItem("Latte", "Latte desc", false, 4.56);
        addItem("Americana", "Americana desc", false, 4.51);
    }

    void addItem(String name, String desc, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(desc, name, vegeterian, price);
        mMenuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getMenuItems() {
        return mMenuItems;
    }

//    public IIterator createIterator() {
//        return new DinerMenuIterator(mMenuItems);
//    }


    @Override public Iterator createIterator() {
        return mMenuItems.values().iterator();
    }
}
