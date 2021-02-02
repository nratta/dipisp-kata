package com.digite.kata.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularMovieTest
{

    @Test
    public void testCalculatePrice()
    {
        Movie movie =  new RegularMovie("XYZ", 0);
        int daysRented = 3;
        assertEquals(3.5, movie.calculatePrice(daysRented), 0);

    }

}
