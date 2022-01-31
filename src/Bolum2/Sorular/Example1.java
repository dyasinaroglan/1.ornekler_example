package Bolum2.Sorular;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //klavyeden girilen 3 sayının ortalmasını alan uygulamayı yazınız?

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        double sayı1 = scanner.nextDouble();
        System.out.println("2.sayıyı giriniz");
        double sayı2 = scanner.nextDouble();
        System.out.println("3.sayıyı giriniz");
        double sayı3 = scanner.nextDouble();

        double toplam = sayı1+sayı2+sayı3;

        double ortalama = toplam/3;

        System.out.println("ortalama = "+ ortalama);
        System.out.printf("ortalama = %.2f ", ortalama);
    }
}
