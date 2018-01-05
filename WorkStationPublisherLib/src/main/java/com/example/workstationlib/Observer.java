package com.example.workstationlib;

/**
 * Created by ilya on 12.12.17.
 */

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
