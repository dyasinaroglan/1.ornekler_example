package Bolum2;

import java.util.Scanner;

public class ModAlma {
    public static void main(String[] args) {
        /*
        kullanicidan 3 haneli bir sayi girmesini isteyin
        ve sayinin birler basamagini bulun
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayı = scanner.nextInt();

        int birlerBasamağı = sayı%10;

        System.out.println("birler basamağı = "+ birlerBasamağı);
    }
}
