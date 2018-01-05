package com.example.workstationlib.natives;

import com.example.workstationlib.DisplayElements;
import com.example.workstationlib.Observer;
import com.example.workstationlib.Subject;

import java.util.Observable;

/**
 * Created by ilya on 12.12.17.
 */

public class CurrentConditionDisplay implements java.util.Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override public void display() {
        System.out.println("Current conditions "+temperature+" conditions "+humidity+"% humidity");
    }

    @Override public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
