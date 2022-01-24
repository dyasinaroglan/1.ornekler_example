package Bolum2;

import java.util.Locale;
import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        /*3.) ekrandan girilen takim gs ise ekrana yasa cimbom
         girilen takim fener ise yasa fener
         degilse kapat tv yi yazdirin :)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("takım ismi giriniz");
        String takımİsmi = scanner.nextLine();

        if(takımİsmi.equalsIgnoreCase("galatasaray")){
            System.out.println("yaşa cimbom");
        }else if(takımİsmi.equalsIgnoreCase("fenerbahçe")){
            System.out.println("yaşa fener");
        }else {
            System.out.println("kapat tv yi");
        }

        /*
        ekrandan bir sayi girin. eger sayi sifirdan buyukse ekrana
        pozitif yazin, eger sayi sifirdan kucukse negatif yazin.
        Pozitif ya da negatif degilse ekrana sifir yazdirin
         */
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        if(sayı>0){
            System.out.println("pozitif");
        }else if (sayı<0){
            System.out.println("negatif");
        }else {
            System.out.println("sıfır");
        }
    }
}
