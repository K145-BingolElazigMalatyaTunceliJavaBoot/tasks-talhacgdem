package org.talhacgdem.week3.GreenGrocer.entity;

public class Fruit {
    private String fruitName;

    private int kg;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void buyFruit(int kg){
        this.kg = this.kg - kg;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
