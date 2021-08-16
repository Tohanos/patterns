package com.example.patterns.observer;

public interface Observed {
    void addObserver(Obzerver obzerver);
    void removeObserver(Obzerver obzerver);
    void notifyObservers();
}
