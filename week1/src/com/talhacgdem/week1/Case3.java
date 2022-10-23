package com.talhacgdem.week1;

public class Case3 {

    private int subVal;
    private int topVal;

    public Case3() {
        this.subVal = 200;
        this.topVal = 500;
    }

    public Case3(int subVal, int topVal) {
        this();
        if (subVal >= topVal) {
            System.out.println("Lower value cannot be greater than or equal to upper value.");
            System.out.println("Values are setting up to default");
        } else {
            this.subVal = subVal;
            this.topVal = topVal;
        }
    }

    public String calculate() {
        int sum = 0; // toplam değişkeni
        for (int i = this.subVal; i <= this.topVal; i++) { // 200 - 500 arasındaki sayıları gezmek için döngü
            if (i % 3 != 0) { // 3'e tam bölünmüyorsa toplam değerine ekleme yapıyoruz
                sum += i;
            }
        }
        return "The sum of the numbers between %d and %d that are not divisible by 3\n   -> %d"
                .formatted(this.subVal, this.topVal, sum);
    }

}
