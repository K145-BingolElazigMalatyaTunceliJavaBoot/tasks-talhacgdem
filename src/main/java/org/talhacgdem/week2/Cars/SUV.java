package org.talhacgdem.week2.Cars;

public class SUV extends Car {

    @Override
    public int getMonthlyRental() {
        return super.getMonthlyRental() + (100 / getAge() * 30);
    }
}
