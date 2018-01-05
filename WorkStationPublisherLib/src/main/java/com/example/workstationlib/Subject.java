package com.example.workstationlib;

/**
 * Created by ilya on 12.12.17.
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
