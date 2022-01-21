package Bolum1;

import java.util.Scanner;

public class StringOrnekler1 {
    public static void main(String[] args) {
        //4.) Ekrandan isim ve soyisminizi girin ve
        // Isminizin ve soyisminizin bas harflerinden sonra
        // . ekleyerek arada bir bosluk olacak sekilde yazdirin
        // Ornek cikti : M. S.

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim = scanner.nextLine();
        System.out.println("soyisminizi girin");
        String soyİsim = scanner.nextLine();

        String isimİlkHarf = isim.substring(0,1)+".";
        String soyİsimİlkHarf = soyİsim.substring(0,1)+".";
        System.out.println(isimİlkHarf);

        String birlestir = isimİlkHarf.concat(soyİsimİlkHarf);
        System.out.println(birlestir);
    }
}
