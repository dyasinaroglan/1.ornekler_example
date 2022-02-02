package Bolum2.Sorular;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız iki integer değerin en büyük ortak bölenini bulan uygulamayı yazınız
        Örneğin 14 ve 35 sayıları için ebob = 7 olmalıdır.
         */
        //(sayı1<sayı2) olmalıdır.

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayı2 = scanner.nextInt();
        int ebob = 0;

        for (int i = 1; i < sayı1; i++) {
            if (sayı1%i == 0 && sayı2%i == 0){
                ebob = i;
            }
        }
        System.out.println("EBOB = "+ ebob);
    }
}
