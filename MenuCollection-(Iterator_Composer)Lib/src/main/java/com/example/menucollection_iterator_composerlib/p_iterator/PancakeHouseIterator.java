package com.example.menucollection_iterator_composerlib.p_iterator;

import java.util.ArrayList;

/**
 * Created by ilya on 09.01.18.
 */

public class PancakeHouseIterator implements IIterator {
    private int pos = 0;
    ArrayList mMenuItems;

    public PancakeHouseIterator(ArrayList menuItems) {
        mMenuItems = menuItems;
    }

    @Override public boolean hasNEXT() {
        if (pos >= mMenuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override public Object next() {
        Object o = mMenuItems.get(pos);
        pos++;
        return o;
    }
}
