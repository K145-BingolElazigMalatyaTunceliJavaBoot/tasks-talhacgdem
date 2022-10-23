package com.talhacgdem.week1;

import java.util.Random;

public class Case4 {
    public int task4() {
        Random random = new Random(); // Random nesnemizi oluşturduk
        int count = 1; // Adım sayısı için int değer
        int current; // Anlık random ifadesini tuttuğumuz değişken
        while (true) { // Kaç adımda bulacağını bilmediğimiz için sonsuz döngü
            current = random.nextInt(500); // random değer
            if (current > 50 && current <= 100){ // karar adımı
                break; // koşul sağlandığında sayacı artırmadan döngüyü kırıyoruz
            }
            count++; // sayacı artırdık
        }
        return count;
    }
}
