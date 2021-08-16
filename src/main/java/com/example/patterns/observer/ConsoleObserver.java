package com.example.patterns.observer;

public class ConsoleObserver implements Obzerver{
    @Override
    public void handleEvent(int temp, int press) {
        System.out.println("Weather has changed: Temp:" + temp + " Press: " + press + "\n");
    }
}
