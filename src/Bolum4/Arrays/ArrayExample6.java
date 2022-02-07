package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        /*
        6 tam sayıdan oluşan bir dizi oluşturun
        ve bunları ters sırada görüntüleyin.
         */

        Scanner scanner = new Scanner(System.in);
        int[] sayılar = new int[6];

       for (int i = 0; i < sayılar.length; i++) {

            System.out.println("sayı giriniz");
            sayılar[i] = scanner.nextInt();
        }
        for (int i = sayılar.length-1; i >= 0 ; i--) {
            System.out.print(sayılar[i] + " ");

        }
    }
}
