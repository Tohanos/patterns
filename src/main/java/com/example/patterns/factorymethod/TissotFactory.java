package com.example.patterns.factorymethod;

public class TissotFactory implements WatchFactory{

    @Override
    public Watch createWatch() {
        return new Tissot();
    }
}
