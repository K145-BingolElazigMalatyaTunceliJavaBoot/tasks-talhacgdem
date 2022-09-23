package org.talhacgdem;

import java.util.Random;

public class Week1 {

    public String task1() {
        Random random = new Random();
        int grade = random.nextInt(100);
        System.out.print("Grade: " + grade + " -> ");
        if (grade > 0 && grade < 35) {          // 0 < grade <= 35 ise FF değeri döndü
            return "FF";
        } else if (grade >= 35 && grade < 50) { // 35 < grade <= 50 ise DC değeri döndü
            return "DC";
        } else if (grade >= 50 && grade < 70) { // 50 < grade <= 70 ise BB değeri döndü
            return "BB";
        } else {                                // 70 < grade <= 100 ise AA değeri döndü
            return "AA";
        }
    }

    public int task2() {
        boolean control; // sayının asal olup olmadığını tuttuğumuz bool ifade
        int sum = 0; // toplam değişkeni
        /*
         * 3 ile 100 arasındaki asal sayıları bulacağız
         * 2 zaten özel bir asal sayı
         */
        for (int i = 3; i <= 100; i++) {
            /* Burada kontrol ifadesini true ile başlatıyoruz.
             * Varsayılan olarak ele aldığımız sayının bir asal sayı olduğunu düşünelim */
            control = true;
            for (int j = 2; j < i; j++) { // 2den başlayarak i sayısına kadar ilerliyoruz
                if (i % j == 0) { // eğer j değeri i değerini tam bölüyorsa asal sayı değildir
                    control = false; // control değerini false yaparak bu sayının bir asal sayı olmadığını belirttik
                    break; // döngünün daha fazla işlemesine gerek olmadığından
                }
            }
            if (control) { // control değeri true ise bu sayı bir asal sayıdır ve toplama ekleneiblir
                sum += i;
            }
        }
        sum += 2; // 2 özel bir asal sayı olduğundan toplama direkt ekledik
        return sum;
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

    public static void main(String[] args) {
        Week1 w = new Week1();
        System.out.println(w.task1());
        System.out.println(w.task2());
        System.out.println(w.task3());
        System.out.println(w.task4());
    }

}
