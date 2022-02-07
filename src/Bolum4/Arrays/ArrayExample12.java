package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample12 {
    public static void main(String[] args) {
        /*
        kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini sorun ve buna bağlı olarak
        aldığınız değerleri bir dizide saklayın. veri alma işlemi bittikten sonra tüm sayıları ve
        ortalmalarını ekrana yazdırın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç sayının ortalamasını bulmak istiyorsunuz");
        int num = scanner.nextInt();
        int toplam = 0;

        int[] sayılar = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("sayı giriniz\n");
            sayılar[i] = scanner.nextInt();

        }
        int ortalama = 0;
        for (int i = 0; i < num; i++) {
             toplam+= sayılar[i];
        }
        System.out.println("ortalama = " + toplam/sayılar.length);
    }
}
