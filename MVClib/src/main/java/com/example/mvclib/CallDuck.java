package com.example.mvclib;

/**
 * Created by ilya on 08.02.2018.
 */

public class CallDuck implements Quackable {
    @Override public void quack() {
        System.out.printf("Kwak");
    }
}
