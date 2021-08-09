package com.example.patterns.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {

        WatchFactory bigBenFactory = new BigBenFactory();
        bigBenFactory.createWatch().showTime();

        WatchFactory tissotFactory = new TissotFactory();
        tissotFactory.createWatch().showTime();
    }
}
