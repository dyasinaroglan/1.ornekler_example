package Bolum2;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        /*
        4.
        Kullanicinin Consoldan harf, karakter ve sayi karisik iceren metnin harf
        ve sayilarini ayirin, sayiyi integera cevirin
        Örnek :       Girdi --> a2ja4va
                    Cikti --> ajava,    24
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("karışık metni giriniz");
        String karısıkMetin = scanner.nextLine();

        String harfler = karısıkMetin.replaceAll("[^a-z]","");  //a ve z dışındakileri boşlukla değiştir.
        String rakamalar = karısıkMetin.replaceAll("[^0-9]","");  // 0 ile 9 sayıları haricindekileri boşlukla değiştir.

        int rakamlarİnt = (int) Integer.parseInt(rakamalar);
        System.out.println("rakamlar = "+ rakamlarİnt +" "+ "harfler = "+ harfler);



    }
}
