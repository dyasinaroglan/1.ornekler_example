package Bolum4.Arrays;

import java.util.Scanner;

public class EkokBulma {
    public static void main(String[] args) {
        //verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız
        int ekok = ekokBul();
        System.out.println(ekok);
    }
    public static int ekokBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();

        int buyukSayı = Math.max(sayı1, sayı2);
        int ekok=0;
        for (int i = buyukSayı; i <= sayı1 * sayı2; i++) {
            if (i % sayı1 == 0 && i % sayı2 == 0) {
                ekok = i; //ekok = 120 demek
                break;

            }
        }
        return ekok;
    }
}
