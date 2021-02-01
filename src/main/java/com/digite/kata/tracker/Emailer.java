package com.digite.kata.tracker;

public class Emailer implements MediaType {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
