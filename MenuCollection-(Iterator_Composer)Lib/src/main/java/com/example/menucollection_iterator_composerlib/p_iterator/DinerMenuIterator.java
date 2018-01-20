package com.example.menucollection_iterator_composerlib.p_iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class DinerMenuIterator implements IIterator {
    int position = 0;
    MenuItem[] mMenuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        mMenuItems = menuItems;
    }

    @Override public boolean hasNEXT() {
        if (position >= mMenuItems.length || mMenuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override public Object next() {
        MenuItem menuItem = mMenuItems[position];
        position++;
        return menuItem;
    }
}
