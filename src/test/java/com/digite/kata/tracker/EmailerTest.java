package com.digite.kata.tracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailerTest {

    MediaType mType;

    @Before
    public void setUp() {
        mType =  new Emailer();
    }
    @Test
    public void testGenerateWeatherAlert()
    {
        assertEquals("It is Rainy", mType.generateWeatherAlert("Rainy"));
    }
}
