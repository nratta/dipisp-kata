package com.digite.kata.refactoring;

public class ChildrenMovie  extends Rental {


    public ChildrenMovie(Movie movie, int daysRented, int priceCode) {
        super(movie, daysRented, priceCode);
    }

    @Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }


}
