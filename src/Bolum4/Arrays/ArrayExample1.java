package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sayi alarak bu sayi uzunlugunda int bir dizi olusturun.
        Dizinin elemanlarini kullanicinin girecegi sayilarla doldurun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        int[] array = new int[sayı];

        for (int i = 0; i < sayı; i++) {
            System.out.println("sayı giriniz");
            int num = scanner.nextInt();
            array[i] = num;

        }
        for (int i = 0; i < sayı; i++) {
            System.out.print(array[i]+",");

        }

    }
}

