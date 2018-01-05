package com.example.weather_o_rama_command.request_receivers;

/**
 * Created by ilya on 05.01.18.
 */

public class GarageDoor {

    public void up() {
        System.out.println("Garage up");
    }

    public void down() {
        System.out.println("Garage down");
    }

    public void stop() {}

    public void lightOn() {
        System.out.printf(" Garage light On");
    }

    public void lightOff() {
        System.out.println("Garage light off");
    }
}
