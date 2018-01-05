package com.example.weather_o_rama_command.request_receivers;

/**
 * Created by ilya on 06.01.18.
 */

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void off() {
        speed = OFF;
    }

    public void low() {
        speed = LOW;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void high() {
        speed = HIGH;
    }

    public int getSpeed() {
        return speed;
    }
}
