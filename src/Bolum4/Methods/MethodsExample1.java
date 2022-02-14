package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample1 {
    public static void main(String[] args) {
        /*
        Kullanicinin girecegi sayinin tek mi cift mi oldugunu bulan bir metot yazin.
         */

        tekMıCiftMı();
        tekMıCiftMı();
    }
    public static void tekMıCiftMı(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        if(sayı%2 == 1){
            System.out.println("sayı tektir");
        }else {
            System.out.println("sayı çifttir");
        }
    }
}
