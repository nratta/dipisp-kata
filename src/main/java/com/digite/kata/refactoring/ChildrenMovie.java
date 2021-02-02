package com.digite.kata.refactoring;

public class ChildrenMovie  extends Movie{

    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double calculatePrice(int daysRented)
    {
        return 0;
    }


}
