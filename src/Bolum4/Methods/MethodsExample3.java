package Bolum4.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsExample3 {
    public static void main(String[] args) {

        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayıları giriniz(boşluk bırakarak)");
        String sayılarCumle = scanner.nextLine(); //boşluk bırakarak yazıyoruz o yüzden string
        String[] array = sayılarCumle.split(" ");
        int[] sayılar = new int[array.length];

        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i] = Integer.parseInt(array[i]);
        }
        enb(sayılar);
        enk(sayılar);
    }
    public static void enk(int[] array){
        Arrays.sort(array);
        System.out.println("en küçük sayı = " + array[0]);
    }
    public static void  enb(int[] array){
        Arrays.sort(array);
        System.out.println("en büyük sayı = " + array[array.length-1]);

    }
}
