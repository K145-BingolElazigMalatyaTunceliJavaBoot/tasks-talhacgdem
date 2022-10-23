package com.talhacgdem.week1;

public class Case3 {

    private int subVal;
    private int topVal;

    public Case3(){
        subVal = 200;
        topVal = 500;
    }

    public Case3(int subVal, int topVal){
        this.subVal = 200;
        topVal = 500;
    }

    public int task3() {
        int sum = 0; // toplam değişkeni
        for (int i = 200; i <= 500; i++) { // 200 - 500 arasındaki sayıları gezmek için döngü
            if (i % 3 != 0) { // 3'e tam bölünmüyorsa toplam değerine ekleme yapıyoruz
                sum += i;
            }
        }
        return sum;
    }

}
