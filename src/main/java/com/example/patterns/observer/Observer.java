package com.example.patterns.observer;

public class Observer {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new FileObserver());
        station.addObserver(new ConsoleObserver());
        station.addObserver(new ConsoleObserver());
        station.addObserver(new ConsoleObserver());
        station.setMeasurements(30, 140);
        station.setMeasurements(31, 141);
    }
}
