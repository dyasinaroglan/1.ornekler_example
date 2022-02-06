package Bolum4.Arrays;

import java.util.Scanner;

public class Calısma6 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle yazmasini isteyin.
        Bu cümledeki harfleri kelime kelime bir diziye atin.
        Cümleyi tersten yazdirin.
         */

        //Array'lerde kullanacağımız split metodu var.

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle = scanner.nextLine();

        String[] kelimeler = cümle.split(" ");  //boşluk gördüğünde kelimeyi alır.

        for (int i = kelimeler.length-1; i >=0; i--) {
            System.out.print(kelimeler[i]+" ");
        }
    }
}
