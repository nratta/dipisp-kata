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
        Movie movie1 = new RegularMovie("XYZ", 0);
        Rental rental1 = new Rental(movie1, 2);
        Movie movie2 = new NewReleaseMovie("ABCD", 1);
        Rental rental2 = new Rental(movie2, 3);
        Movie movie3 = new ChildrenMovie("Cars", 2);
        Rental rental3 = new Rental(movie3, 2);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        // Creating data ends
    String expOutput = "Rental Record for User1\n" +
            "\tXYZ\t2.0\n" +
            "\tABCD\t9.0\n" +
            "\tCars\t1.5\n" +
            "Amount owed is 12.5\n" +
            "You earned 4 frequent renter points";
        assertEquals(expOutput,customer.statement());

    }
}
