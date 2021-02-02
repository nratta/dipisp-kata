package com.digite.kata.refactoring;

public class ChildrenMovie  extends Movie{

    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
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
