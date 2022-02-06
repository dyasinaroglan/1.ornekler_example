package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sayi alarak bu sayi uzunlugunda int bir dizi olusturun.
        Dizinin elemanlarini kullanicinin girecegi sayilarla doldurun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir dizi olsun");
        int num =scanner.nextInt();

        int[] array = new int[num];



        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
            array[i]=scanner.nextInt();              //bu kısımda array i yazdırıyoruz.
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        }

    }

