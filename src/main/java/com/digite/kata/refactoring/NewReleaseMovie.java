package com.digite.kata.refactoring;

public class NewReleaseMovie  extends Rental{

    public NewReleaseMovie(Movie movie, int daysRented, int priceCode) {
        super(movie, daysRented, priceCode);
    }
    @Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = daysRented *3 ;
        return thisAmount;
    }
}
