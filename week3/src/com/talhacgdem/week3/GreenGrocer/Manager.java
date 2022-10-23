package com.talhacgdem.week3.GreenGrocer;

import com.talhacgdem.week3.GreenGrocer.entity.Fruit;
import com.talhacgdem.week3.GreenGrocer.exception.NoMoreItemException;


public class Manager {

    public void add(Fruit fruit, int kg) {
        fruit.setKg(kg);
    }

    public int getKg(Fruit fruit){
        return fruit.getKg();
    }

    public void buyFruit(Fruit fruit, int kg) throws NoMoreItemException {
        if (fruit.getKg() < kg) {
            throw new NoMoreItemException(fruit.getClass().getSimpleName(), kg);
        } else {
            fruit.setKg(fruit.getKg() - kg);
            System.out.printf("%d kg of %s(s) received\n", kg, fruit.getClass().getSimpleName());
        }
    }
}
