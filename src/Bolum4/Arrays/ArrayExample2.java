package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        /*
        Kullanicidan 4 tane isim girmesini isteyin.
        Bu isimlerden uzunlugu 6 dan buyuk kac isim oldugunu bulun.
         */
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[4];
        int miktar = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("isim giriniz");
            array[i] = scanner.nextLine();

            if(array[i].length()>6){
                miktar++;
            }

        }
        System.out.println("miktar = " + miktar);


        }

    }

