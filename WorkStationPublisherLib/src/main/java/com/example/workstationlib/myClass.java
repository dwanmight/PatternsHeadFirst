package com.example.workstationlib;

import com.example.workstationlib.natives.CurrentConditionDisplay;
import com.example.workstationlib.natives.WeatherData;

public class myClass {

    public static void main(String[] args) {
        com.example.workstationlib.natives.WeatherData weatherData = new WeatherData();

        com.example.workstationlib.natives.CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(23, 12, 34);
        weatherData.setMeasurements(33, 22, 44);
        weatherData.setMeasurements(43, 32, 54);
    }
}
