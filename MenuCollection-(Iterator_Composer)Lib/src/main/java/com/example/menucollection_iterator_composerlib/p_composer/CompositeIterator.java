package com.example.menucollection_iterator_composerlib.p_composer;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by ilya on 20.01.18.
 */

public class CompositeIterator implements Iterator {
    Stack mStack = new Stack();

    public CompositeIterator(Iterator iterator) {
        mStack.push(iterator);
    }

    @Override public boolean hasNext() {
        if (mStack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) mStack.peek();
            if (!iterator.hasNext()) {
                mStack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) mStack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                mStack.push(menuComponent);
            }
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override public void remove() {
        throw new UnsupportedOperationException();
    }
}
