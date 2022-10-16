package org.talhacgdem.week1;

public class Case2 {

    private int _FROM;
    private int _TO;

    public Case2(){
        this._TO = 100;
        this._FROM = 3;
    }

    public Case2(int from, int to){
        if (to <= from) {
            System.out.println("Invalid value range. Second parameter must be bigger than first parameter");
            System.out.println("Params setting up to default values. 3-100");
            this._TO = 100;
            this._FROM = 3;
        } else {
            this._TO = to;
            if (to < 3) {
                System.out.println("It is not correct for the lower value to be less than 3. Lower value is assigned to the parameter by default 3.");
                to = 3;
            }
            this._FROM = from;
        }
    }

    /*
     * _FROM ile _TO arasındaki asal sayıları bulan method
     * 2 zaten özel bir asal sayı
     */

    public int calculatePrimeNumbers(){
        boolean control; // sayının asal olup olmadığını tuttuğumuz bool ifade
        int sum = 0; // toplam değişkeni

        for (int i = this._FROM; i <= this._TO; i++) {
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
        if (this._FROM <= 3){
            sum += 2; // 2 özel bir asal sayı olduğundan toplama direkt ekledik
        }

        return sum;
    }


}
