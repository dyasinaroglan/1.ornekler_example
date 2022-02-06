package Bolum3.Loops;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("***BANKAMIZA HOŞ GELDİNİZ");
        int bakiye = 2500;

      while (true) {
          String menu = "***MENU***\n" +
                  "1.BAKİYE ÖĞRENME\n" +
                  "2.PARA ÇEKME\n" +
                  "3.PARA YATIRMA\n" +
                  "ÇIKIŞ İÇİN Q'YA BASINIZ";
          System.out.println("**************************");
          System.out.println(menu);
          System.out.println("**************************");
          System.out.println("YAPACAĞINIZ İŞLEMİ SEÇİNİZ");
          String islem = scanner.nextLine();
          if (islem.equalsIgnoreCase("q")){
              System.out.println("PROGRAMDAN ÇIKIŞ YAPILIYOR...");
          break;
      }
          else if(islem.equals("1")){
              System.out.println("GÜNCEL BAKİYENİZ : " + bakiye);

          }
          else if(islem.equals("2")){
              System.out.println("ÇEKİLECEK TUTARI GİRİNİZ");
              int tutar = scanner.nextInt();
              scanner.nextLine();
              if(tutar>bakiye){
                  System.out.println("BAKİYE YETERSİZ,LÜTFEN TEKRAR DENEYİNİZ");
              }else {
                  bakiye-=tutar;
                  scanner.nextLine();
                  System.out.println(tutar + " LİRA HESABINIZDAN ÇEKİLMİŞTİR");
                  System.out.println("güncel bakiyeniz : " + bakiye );
              }
          }else if(islem.equals("3")){
              System.out.println("YATIRALACAK TUTARI GİRİNİZ");
              int tutar = scanner.nextInt();
              bakiye+= tutar;
              scanner.nextLine();
              System.out.println("YATIRILAN TUTAR : " + tutar);
              System.out.println("GÜNCEL BAKİYENİZ : " + bakiye);
          }else {
              System.out.println("GEÇERSİZ İŞLEM,TEKRAR DENEYİNİZ");
          }

      }
    }
}
