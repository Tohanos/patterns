package com.example.patterns.factorymethod;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BigBen implements Watch{

    @Override
    public void showTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId bigBenZoneId = ZoneId.of("Europe/London");
        System.out.println("Big Ben's time is " + ZonedDateTime.of(localDateTime, bigBenZoneId));
    }
}
