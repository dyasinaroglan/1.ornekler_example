package Bolum4.Arrays;

import java.util.Scanner;

public class Calısma14 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi isteyin.
        Bu sayilardan ortalamayi gecen sayi miktarini bulun.
         */

        Scanner scanner = new Scanner(System.in);

        int[] sayı = new int[5];
        int toplam = 0;

        for (int i = 0; i < sayı.length; i++) {
            System.out.println("sayı giriniz");
            sayı[i] = scanner.nextInt();
            toplam += sayı[i]; //burada tüm sayıları yazdırdık ve üstüne ekleyerek toplamlarını bulduk
        }
        int miktar = 0;
        for (int i = 0; i < sayı.length; i++) {
            int ort = toplam / sayı.length;
            if (sayı[i] > ort) {
                miktar++;
            }
        }
        System.out.println("ortalmayı geçen sayı miktarı:" + miktar);
    }
}

