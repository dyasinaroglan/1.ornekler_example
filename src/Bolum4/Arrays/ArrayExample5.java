package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi isteyin.
        Bu sayilardan ortalamayi gecen sayi miktarini bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int[] sayılar = new int[5];
        int toplam = 0;

        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("sayıları giriniz");
            sayılar[i] = scanner.nextInt();
            toplam += sayılar[i];
        }
        int ortalama = toplam/ sayılar.length;
        int miktar = 0;

        for (int i : sayılar) {
            if (i>ortalama){
                miktar++;
        }
        }
        System.out.println("miktar : " + miktar);
    }
}
