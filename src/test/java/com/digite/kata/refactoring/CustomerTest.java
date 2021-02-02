package com.digite.kata.refactoring;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CustomerTest {

    @Before
    public void setUp()
    {

    }

    @Test
    public void testStatement()
    {
        // Creating data starts
        Customer customer = new Customer("User1");
        Movie movie1 = new Movie("ABCD", 1);
        Rental rental1 = new Rental(movie1, 2);
        Movie movie2 = new Movie("Titanic", 2);
        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental1);
        customer.addRental(rental2);
        // Creating data ends
    String expOutput = "Rental Record for User1\n" +
            "\tABCD\t6.0\n" +
            "\tTitanic\t1.5\n" +
            "Amount owed is 7.5\n" +
            "You earned 3 frequent renter points";
        assertEquals(expOutput,customer.statement());

    }
}
