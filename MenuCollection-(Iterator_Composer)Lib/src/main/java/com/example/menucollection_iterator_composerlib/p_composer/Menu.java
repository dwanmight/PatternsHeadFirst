package com.example.menucollection_iterator_composerlib.p_composer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilya on 19.01.18.
 */

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    private Iterator mIterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override public String getName() {
        return name;
    }

    @Override public String getDescription() {
        return description;
    }

    @Override public void print() {
        System.out.println(" " + getName());
        System.out.println(" " + getDescription());
        System.out.println("--------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override public Iterator createIterator() {
        if (mIterator == null) {
            mIterator = new CompositeIterator(menuComponents.iterator());
        }
        return mIterator;
    }
}
