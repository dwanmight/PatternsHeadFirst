package com.example.collectionadapterlib;

/**
 * Created by ilya on 06.01.18.
 */

public class EnumerationIterator implements Iterator {
    private Enumeration mEnumeration;

    public EnumerationIterator(Enumeration enumeration) {
        mEnumeration = enumeration;
    }

    @Override public boolean hasNext() {
        return mEnumeration.hasMoreElements();
    }

    @Override public void next() {
        mEnumeration.nextElements();
    }

    @Override public void remove() {
        throw new UnsupportedOperationException();
    }
}
