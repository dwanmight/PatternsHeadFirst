package com.example.menucollection_iterator_composerlib.p_composer;

/**
 * Created by ilya on 19.01.18.
 */

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu=new Menu("Pancacke house menu","Breakfast");
        MenuComponent dinerMenu=new Menu("DINER  menu","Lunch");
        MenuComponent cafeMenu=new Menu("CAFE  menu","Diner");
        MenuComponent dessertMenu=new Menu("DESSERT menu","Dessert of course");

        MenuComponent allMenus=new Menu("All MENUS","All menu combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Pasta","Spaghetti",3.89,true));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie","Apple pie desc",1.59,true));

        Waitress waitress=new Waitress(allMenus);
        waitress.printMenu();
    }
}
