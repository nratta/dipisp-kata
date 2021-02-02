package com.digite.kata.refactoring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChildrenMovieTest {

    @Test
    public void testCalculatePrice()
    {
        Movie movie = new Movie("Cars");
        int daysRented = 2;
        Rental rental =  new ChildrenMovie(movie, daysRented,2 );


        assertEquals(1.5, rental.calculatePrice(daysRented), 0);

    }
}
