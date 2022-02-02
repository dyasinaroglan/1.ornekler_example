package Bolum3.SwitchCase;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {
        /*
        /*
        Kullanicidan 2 tamsayi alin.
        Yine kullanicidan yapmak istedigi islemi alip islemleri yaptirin
        Toplama icin t, cikarma icin c, Carpma icin p, bölme icin b olacak
        Bu soruyu switch-case ile yapin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();
        scanner.nextLine();

        String islemler = "***İŞLEMLER***\n" +
                "toplama işlemi için-->T\n" +
                "çıkarma işlemi için-->C\n" +
                "çarpma işlemi için -->Ç\n" +
                "bölme işlemi için --B\n" +
                "çıkış için -->Q\n";

        System.out.println(islemler);
        islemler = scanner.nextLine();

        switch (islemler) {
                    case "T":
                        System.out.println("toplama = " + (sayı1 + sayı2));
                        break;
                    case "C":
                        System.out.println("çıkarma = " + (sayı1 - sayı2));
                        break;
                    case "Ç":
                        System.out.println("çarpma = " + (sayı1 * sayı2));
                        break;
                    case "B":
                        if (sayı2 != 0) {
                            System.out.println("bölme = " + (sayı1 / sayı2));
                        } else {
                            System.out.println("tanımsız");
                        }
                        break;
            default:
                System.out.println("geçersiz işlem");
                }
        }
    }


