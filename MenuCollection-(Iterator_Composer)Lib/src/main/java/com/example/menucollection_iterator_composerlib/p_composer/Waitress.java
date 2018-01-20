package com.example.menucollection_iterator_composerlib.p_composer;

import java.util.Iterator;

/**
 * Created by ilya on 19.01.18.
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegeterianMenu(){
        Iterator iterator=new CompositeIterator(allMenus.createIterator());
        while (iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (Exception e){e.printStackTrace();}
        }
    }
}
