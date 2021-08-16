package com.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{
    int temperature;
    int pressure;
    List<Obzerver> observers = new ArrayList<>();

    void setMeasurements(int t, int pressure) {
        this.temperature = t;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Obzerver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Obzerver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Obzerver o : observers) {
            o.handleEvent(temperature, pressure);
        }
    }
}
