package Bolum2.Sorular;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
        10 için ekranda 2,3,5,7 değerleri olmalıdır.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        for (int i =2 ; i <= sayı ; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    asal  = false;
                    break;
                }
            }
            if (asal){
                System.out.print(i+",");
            }
        }
    }
}
