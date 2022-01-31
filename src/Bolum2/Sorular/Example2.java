package Bolum2.Sorular;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //kalvyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        int kenar1 = scanner.nextInt();
        System.out.println("2.kenarı giriniz");
        int kenar2 = scanner.nextInt();
        System.out.println("3.kenarı giriniz");
        int kenar3 = scanner.nextInt();

        if(kenar1 == kenar2 && kenar3 == kenar2){
            System.out.println("girdiğiniz kenarların hepsi birbirine eşittir...EŞKENAR ÜÇGEN");
        }else if (kenar1 == kenar2 ){
            System.out.println("girdiğiniz iki kenar eşittir...İKİZKENAR ÜÇGEN");
        }else if (kenar1==kenar3){
            System.out.println("girdiğiniz iki kenar eşittir...İKİZKENAR ÜÇGEN");
        }else if (kenar2 == kenar3){
            System.out.println("girdiğiniz iki kenar eşittir...İKİZKENAR ÜÇGEN");
        }else {
            System.out.println("girdiğiniz üç kenar uzunluğuda farklıdır...NORMAL ÜÇGEN");
        }
    }
}
