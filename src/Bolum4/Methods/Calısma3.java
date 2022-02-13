package Bolum4.Methods;

import java.util.Scanner;

public class Calısma3 {
    public static void main(String[] args) {
        /*
        Kullanicinin girecegi sayinin tek mi cift mi oldugunu bulan bir metot yazin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        tekMiCiftMi(sayı);
    }
    public static void tekMiCiftMi (int sayı){

        if(sayı%2==0){
            System.out.println("sayı çifttir.");
        }
        else {
            System.out.println("sayı tektir");
        }


    }
}
