package Ternary;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String sonuc = (num%2 == 0) ? "sayı 2'ye bölünür" : (num%3 ==0) ? "sayı 3'e bölünür" : "sayı 2 veya 3'e bölünmez";
        System.out.println(sonuc);          //true kısmı                 //else kısmı              // else kısmı

        //iki nokta (:) öncesi true kısmı sonrası ise false kısmını verir

        //bunun if else durumu nasıl??

        if (num%2 == 0){
            sonuc ="sayı 2'ye bölünür";
        }else {
            if(num%3 == 0){
                sonuc="sayı 3'e bölünür";
            }else {
                sonuc ="sayı 2 veya 3'e bölünmez";   //bu ifade ile yukarıdaki ifade aynı şeye geliyor.
            }
        }


    }
}
