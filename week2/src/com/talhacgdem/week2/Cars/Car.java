package com.talhacgdem.week2.Cars;

public abstract class Car {
    private int luggageCapacity;
    private int dailyRental;
    private String color;
    private int monthlyRental;
    private int age;

    public Car(){

    }

    public Car(int luggageCapacity, int dailyRental, String color, int monthlyRental, int age) {
        this.luggageCapacity = luggageCapacity;
        this.dailyRental = dailyRental;
        this.color = color;
        this.monthlyRental = monthlyRental;
        this.age = age;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public int getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(int dailyRental) {
        this.dailyRental = dailyRental;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(int monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString(){
        return "%s :{\"luggageCapacity\":%s, \"dailyRental\":%s, \"color\":%s, \"monthlyRental\":%s, \"age\":%s}"
                .formatted(this.getClass().getSimpleName(), luggageCapacity, dailyRental, color, monthlyRental, age);
    }
}
