package Bolum3.Loops;

import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String[] args) {
        /*
        Kullanicidan tam sayi girmesini isteyin. Bu sayilarin karekökünü
        ekrana yazdirin. Kullanici 0 girene kadar bu islemi tekrarlayin.
         */

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("sayı giriniz");
            num = scanner.nextInt();
            int karakök =(int) Math.sqrt(num);
            System.out.println("karakök = "+ karakök);
        }
        while(num != 0); //num 0 a eşit olmayana kadar girmeye devam et.
        }
    }

