package com.example.menucollection_iterator_composerlib.p_iterator;

import java.util.Iterator;

/**
 * Created by ilya on 09.01.18.
 */

public class DinerMenuIteratorNew implements Iterator {
    int position = 0;
    MenuItem[] mMenuItems;

    public DinerMenuIteratorNew(MenuItem[] menuItems) {
        mMenuItems = menuItems;
    }

    @Override public boolean hasNext() {
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

    @Override public void remove() {
        if (position <= 0) {
            throw new UnsupportedOperationException();
        } else {
            if (mMenuItems[position - 1] != null) {
                for (int i = position - 1; i < mMenuItems.length - 1; i--) {
                    mMenuItems[i]=mMenuItems[i+1];
                }
                mMenuItems[mMenuItems.length-1]=null;
            }
        }
    }
}
