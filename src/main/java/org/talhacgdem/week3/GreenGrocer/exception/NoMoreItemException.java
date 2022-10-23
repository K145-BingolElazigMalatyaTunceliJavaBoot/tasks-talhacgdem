package org.talhacgdem.week3.GreenGrocer.exception;

public class NoMoreItemException extends RuntimeException{
    public NoMoreItemException(String fruitName, int kg){
        super("Unfortunately we do not have %d kilograms of %s\n".formatted(kg, fruitName));
    }
}
