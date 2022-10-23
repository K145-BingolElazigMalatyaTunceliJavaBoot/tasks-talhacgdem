package com.talhacgdem.week1;


/*
THIS CASE NOT FINISH YET..
 */


public class Main {
    public static void main(String[] args) {
        Case1 c1_1 = new Case1();
        Case1 c1_2 = new Case1(76);
        System.out.println("Case1");
        System.out.println(c1_1.getGradeDetails());
        System.out.println(c1_2.getGradeDetails());
        System.out.println("*******************************************");



        Case2 c2_1 = new Case2();
        Case2 c2_2 = new Case2(4857,5060);
        System.out.println("Case2");
        System.out.println(c2_1.calculatePrimeNumbers());
        System.out.println(c2_2.calculatePrimeNumbers());
        System.out.println("*******************************************");
    }
}
