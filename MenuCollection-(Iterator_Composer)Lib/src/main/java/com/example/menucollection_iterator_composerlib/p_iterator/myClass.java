package com.example.menucollection_iterator_composerlib.p_iterator;

public class myClass {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenuNew pancakeHouseMenu = new PancakeHouseMenuNew();
        CafeMenu cafeMenu = new CafeMenu();

//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        WaitressWithCafe waitressWithCafe = new WaitressWithCafe(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitressWithCafe.printMenu();
    }
}
