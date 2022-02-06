package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane sayi girmesini isteyin.
        Bu sayilardan yüzler basamagi en büyük olan sayiyi bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int enb = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". sayı giriniz");
            array[i] = scanner.nextInt();
        }
        for (int sayı : array) {
            int yüzler = (sayı / 100) % 10;
            if (yüzler > enb) {
                enb = yüzler;
            }
        }
        System.out.println("enb : " + enb);
    }
}

