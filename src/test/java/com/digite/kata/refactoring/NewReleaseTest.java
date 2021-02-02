package com.digite.kata.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseTest {

    @Test
    public void testCalculatePrice()
    {
        Movie movie = new Movie("ABCD");
        int daysRented = 3;
        Rental rental =  new NewReleaseMovie(movie, 1,3 );

        assertEquals(9, rental.calculatePrice(daysRented), 0);

    }
}


