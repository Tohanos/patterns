package com.example.patterns.factorymethod;

public class BigBenFactory implements WatchFactory{
    @Override
    public Watch createWatch() {
        return new BigBen();
    }
}
