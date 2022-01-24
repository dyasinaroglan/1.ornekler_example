package Bolum2;

import java.util.Scanner;

public class randomİfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan 1-9 arasi bir tam sayi girmesini isteyin. 0-10 arasi bir random sayi
        tanimlayin. Eger kullanicinin girdigi sayi ile random sayi esit ise
        ekrana tebrikler yazdirin. Eger cevap yanlis ise maalesef kaybettiniz yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        int randomSayı =(int) Math.random()*10-5;
        if(sayı==randomSayı){
            System.out.println("TEBRİKLER");
        }else {
            System.out.println("MAALESEF KAYBETTİNİZ");
        }
    }
}
