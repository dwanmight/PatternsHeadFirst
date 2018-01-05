package com.example.workstationlib;

/**
 * Created by ilya on 12.12.17.
 */

public class CurrentConditionDisplay implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }

    @Override public void display() {
        System.out.println("Current conditions "+temperature+" conditions "+humidity+"% humidity");
    }
}
