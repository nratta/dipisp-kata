package com.digite.kata.tracker;

public class Phone implements MediaType {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
