package com.digite.kata.refactoring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChildrenMovieTest {

    @Test
    public void testCalculatePrice()
    {
        Movie movie =  new ChildrenMovie("Cars", 2);
        int daysRented =2;
        assertEquals(1.5, movie.calculatePrice(daysRented), 0);

    }
}
