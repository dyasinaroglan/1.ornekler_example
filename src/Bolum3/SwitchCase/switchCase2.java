package Bolum3.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanın gününü giriniz");
        String gun = scanner.nextLine();
        String yeniGun = gun.toLowerCase(Locale.ROOT); //büyük harfleri küçültüyor
        //sen büyük de yazsan küçük de yazsan sana dogru sonucu vericek.

        switch (yeniGun){
            case "pazartesi" :
                System.out.println("1.gün");
                break;
            case "salı" :
                System.out.println("2.gün");
                break;
            case "çarşamba" :
                System.out.println("3.gün");
                break;
            case "perşembe" :
                System.out.println("4.gün");
                break;
            case "cuma" :
                System.out.println("5.gün");
                break;
            case "cumartesi" :
                System.out.println("6.gün");
                break;
            case "pazar" :
                System.out.println("7.gün");
                break;

        }
    }
}
