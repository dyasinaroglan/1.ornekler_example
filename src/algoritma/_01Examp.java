package algoritma;

import java.util.Scanner;

public class _01Examp {
    public static void main(String[] args) {

        //0 sayısı girilene kadar sayıların toplamını veren program

        int sayi, toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("0 sayısı girilene kadar sayıların toplamını veren program\n\n");
        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();


        while (sayi != 0) {
            toplam += sayi;
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = scanner.nextInt();
        }

        System.out.println("\nGirilen sayıların toplamı: " + toplam);
    }
}
