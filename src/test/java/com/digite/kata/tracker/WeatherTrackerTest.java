package com.digite.kata.tracker;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherTrackerTest {

   MediaType type1;
   MediaType type2;
    @Before
    public void setUp() {
        type1 = new Phone();
        type2 = new Emailer();
    }
    @Test
    public void testSetCurrentConditionsAsRainy()
    {
        WeatherTracker tracker = new WeatherTracker(type1, type2);
       // assert   tracker.setCurrentConditions("rainy");
    }
    @Test
    public void testSetCurrentConditionsAsSunny()
    {
        WeatherTracker tracker = new WeatherTracker(type1, type2);
        //tracker.setCurrentConditions("sunny");

    }
}
