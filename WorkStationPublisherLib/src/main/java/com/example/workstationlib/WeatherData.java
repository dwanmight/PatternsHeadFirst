package com.example.workstationlib;

import java.util.ArrayList;

/**
 * Created by ilya on 12.12.17.
 */

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override public void removeObserver(Observer observer) {
        int pos = observers.indexOf(observer);
        if (pos >= 0) observers.remove(pos);
    }

    @Override public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ((Observer) observers.get(i)).update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
