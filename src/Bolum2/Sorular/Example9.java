package Bolum2.Sorular;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        //100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("notunuzu girin");
        int not = scanner.nextInt();

        if(not>=85 && not<=100){
            System.out.println("AA");
        }else if(not<85 && not>=70){
            System.out.println("BB");
        }else if(not<70 && not>=60){
            System.out.println("CC");
        }else if (not<60 && not>=50){
            System.out.println("DD");
        }else if (not<50 && not>=0){
            System.out.println("KALDINIZ");
        }else {
            System.out.println("TANIMSIZ NOT");
        }

    }
}
