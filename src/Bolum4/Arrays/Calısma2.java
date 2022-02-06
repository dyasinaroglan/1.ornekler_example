package Bolum4.Arrays;

import java.util.Scanner;

public class Calısma2 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane isim girmesini isteyin.
        Bu isimlerden uzunlugu 6 dan buyuk kac isim oldugunu bulun.
         */

        Scanner scanner = new Scanner(System.in);
        String[] array = new  String[5];

        int count=0;

        for (int i = 0; i < array.length ; i++) {
            System.out.println("isim girin");
            array[i]=scanner.nextLine();
            if (array[i].length() > 6) {
                count++;
            }
        }
        System.out.println("miktar:"+count);
        }
    }

