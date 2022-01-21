package Bolum1;

import java.util.Scanner;

public class StringOrnekler {
    public static void main(String[] args) {
        //1.) ekrandan isminizi girin
        // ve ilk harfinin A olup olmadigini kontrol edin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim = scanner.nextLine();

        boolean ilkHarf = isim.startsWith("A");
        System.out.println(ilkHarf);

        //2.)Soyisminizi ekrandan alin
        // ve son harfinin k ile bitip bitmedigini kontrol edin.

        System.out.println("soyisminizi girin");
        String soyİsim = scanner.nextLine();
        System.out.println(soyİsim.endsWith("k"));

        //3.) Ekrandan dogum yilinizi girin
        // ve bu degiskenin bos olup olmadigini kontrol edin.

        System.out.println("doğum tarihinizi girin");
        String dogumYılı = scanner.nextLine();
        boolean bosMu = dogumYılı.isEmpty();

        System.out.println(bosMu);


    }
}
