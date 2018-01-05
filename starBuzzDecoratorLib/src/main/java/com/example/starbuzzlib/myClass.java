package com.example.starbuzzlib;

import com.example.starbuzzlib.condiments.Mocha;
import com.example.starbuzzlib.condiments.Soy;
import com.example.starbuzzlib.condiments.Whip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class myClass {

    public static void main(String[] args) {
        Beverage beverage = new Esspresso();
        System.out.println("beverage " + beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("beverage " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("beverage " + beverage3.getDescription() + " $" + beverage3.cost());


        System.out.println("\nTest input stream");

        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.rtf")));

            while ((c = in.read()) >= 0) {
                System.out.println("read c = " + (char) c);
            }
            in.close();
        } catch (Exception e) {e.printStackTrace();}
    }
}
