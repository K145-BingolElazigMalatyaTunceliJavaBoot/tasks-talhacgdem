package com.talhacgdem.week3.GreenGrocer;

import com.talhacgdem.week3.GreenGrocer.entity.Apple;
import com.talhacgdem.week3.GreenGrocer.entity.Cherry;
import com.talhacgdem.week3.GreenGrocer.entity.Pear;
import com.talhacgdem.week3.GreenGrocer.exception.NoMoreItemException;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Apple apple = new Apple();
        Pear pear = new Pear();
        Cherry cherry = new Cherry();

        manager.add(apple,50);
        manager.add(cherry,30);
        manager.add(pear,10);

        try{
            manager.buyFruit(apple,20);
            manager.buyFruit(cherry,15);
            manager.buyFruit(pear,30);
        }catch (NoMoreItemException noMoreItemException){
            System.err.println(noMoreItemException.getMessage());
        }
    }
}
