package com.example.menucollection_iterator_composerlib.p_composer;

import java.util.Iterator;

/**
 * Created by ilya on 20.01.18.
 */

public class NullIterator implements Iterator {

    @Override public boolean hasNext() {
        return false;
    }

    @Override public Object next() {
        return null;
    }

    @Override public void remove() {
        throw new UnsupportedOperationException();
    }
}
