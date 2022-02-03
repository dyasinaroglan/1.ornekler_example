package Bolum3.Loops;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        /*
        Math.random() sonucu double deger üretiyor. Ama bana tam sayi kismi lazim oldugu
        icin basina (int) deyip tip dönüsümü yapiyoruz.

        0-100 arasi Random bir sayi olusturun. Kullaniya 5 hak verin.
        Eger dogru tahmin ederse Tebrikler yazdirin. 5 kerede de bilemezse
        oyunu kaybettiniz yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random()*100);
        int hak = 0;

        while (hak<5){
            System.out.println("sayı giriniz");
            int sayı = scanner.nextInt();
            if(random == sayı){
                System.out.println("TEBRİLKER..! KAZANDINIZ..!");
                break;
            }else {
                System.out.println("BİLEMEDİNİZ..TEKRAR DENEYİNİZ");
            }
            hak++;


            if(hak == 5){
                System.out.println("OYUNU KAYBETTİNİZ");
                System.out.println("random sayı = " + random);
            }

        }

    }
}
