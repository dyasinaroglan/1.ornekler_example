package Bolum2;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Sifre belli sartlari saglamasi gerekiyor

        1. en az 6 karakter olmali
        2. icinde pass ya da sifre gecmemeli
        3. en fazla 12 karakter olmali

        girilen sifre bu kurallara uyuyorsa ekrana sifre basarili
        degilse sifre basarisiz yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifrenizi giriniz");
        String sifre = scanner.nextLine();

        if(sifre.length()>=6 && sifre.length()<=12 && (!sifre.contains("pass")) && (!sifre.contains("sifre"))){
            System.out.println("ŞİFRE BAŞARILI");
        }else {
            System.out.println("ŞİFRE BAŞARISIZ, LÜTFEN TEKRAR DENEYİNİZ");
        }
    }
}
