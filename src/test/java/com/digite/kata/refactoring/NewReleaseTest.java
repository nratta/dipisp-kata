package com.digite.kata.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseTest {

    @Test
    public void testCalculatePrice()
    {
        Movie movie =  new NewReleaseMovie("ABCD", 1);
        int daysRented = 3;
        assertEquals(9, movie.calculatePrice(daysRented), 0);

    }
}


