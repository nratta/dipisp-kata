package com.digite.kata.refactoring;

public class NewReleaseMovie  extends Movie{

    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }
    @Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = daysRented *3 ;
        return thisAmount;
    }
}
