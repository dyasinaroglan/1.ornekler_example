package Bolum2.Sorular;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        int faktöriyel = 1;

        for (int i = 1; i <= sayı; i++) {
            faktöriyel*=i;
        }
        System.out.println("faktöriyel = " + faktöriyel);

    }
}
