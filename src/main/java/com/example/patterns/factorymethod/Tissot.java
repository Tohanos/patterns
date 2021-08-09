package com.example.patterns.factorymethod;

import java.util.Date;

public class Tissot implements Watch{
    @Override
    public void showTime() {
        System.out.println("Your hand's time is " + new Date());
    }
}
