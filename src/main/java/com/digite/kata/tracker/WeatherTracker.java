package com.digite.kata.tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Phone;

public class WeatherTracker {
    String currentConditions;
    MediaType phone;
    MediaType emailer;

    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    public WeatherTracker(MediaType type1, MediaType type2) {
        phone = type1;
        emailer = type2;
    }


    public String setCurrentConditions(String weatherDescription, MediaType mediaTYpe) {
        this.currentConditions = weatherDescription;
        String alert = mediaTYpe.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
        return alert;
    }
}