package com.talhacgdem.week2.Cars;

public class HatchBack extends Car {
    @Override
    public int getMonthlyRental() {
        System.err.println("Hatchback type vehicle cannot be rented monthly.");
        return -1;
    }
}
