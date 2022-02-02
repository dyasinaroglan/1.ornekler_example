package Bolum2.Sorular;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        /*
        Girilen bir metnin palindrome olup olmadığını kontrol eden programı yazınız.
        Tersten okunuşu aynı olan kelimeler palindrome'dur. Kaçak gibi...

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scanner.nextLine();
        String yeniKelime = "";

        for (int i = kelime.length()-1; i >= 0 ; i--) {
            yeniKelime+= kelime.charAt(i);
        }
        if (yeniKelime.equals(kelime)){
            System.out.println("girilen kelime polindrom bir kelimedir.");
        }else {
            System.out.println("girilen kelime polindrom kelime değildir.");
        }
        }
    }



