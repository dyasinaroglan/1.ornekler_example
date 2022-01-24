package Bolum2;

import java.util.Locale;
import java.util.Scanner;

public class ifElse6 {
    public static void main(String[] args) {
        /*
        Bir otopark ücret hesapalama programı yapılma isteniyor.
        0-2 saat ara 5€,
        2-5 arası 10€ ,
        5 saatten sonra 15€ olarak saat girildiğinde ücreti yazdırınız.
        Indirim karti varsa %20 indirim yapin
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("otoparkta kalma süresi(saat)");
        int süre = scanner.nextInt();
        scanner.nextLine();
        System.out.println("indirim kartı var mı? (YES/NO");
        String indirimKartı = scanner.nextLine();
        double fiyat =0;

        if(süre<=2) {
            if (indirimKartı.toUpperCase(Locale.ROOT).equals("YES"))
                fiyat = 5 * 0.8;
            else
                fiyat = 5;
        }
        else if (süre>2 && süre<=5){
                if(indirimKartı.toUpperCase(Locale.ROOT).equals("YES"))
                    fiyat = 10*0.8;
                else
                    fiyat = 10;
            }
        else {
            if(indirimKartı.toUpperCase(Locale.ROOT).equals("YES"))
                fiyat = 15*0.8;
        else
            fiyat = 15;
        }
        System.out.println("borcunuz = "+ fiyat);
    }
}

