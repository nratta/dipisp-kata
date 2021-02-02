package com.digite.kata.refactoring;

public class RegularMovie  extends Movie{

    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }
@Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}
