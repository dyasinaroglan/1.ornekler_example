package Bolum3.Loops;

import java.util.Scanner;

public class AmstrongSayı {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();     //1234 4 basamaklı  1.1.1.1 + 2.2.2.2 + 3.3.3.3 + 4.4.4.4
        System.out.println("basamak sayısı giriniz");
        int basamakSayısı= scanner.nextInt();
        int rakam = 0;
        int carpım = 1;
        int toplam = 0;

        for (int i = 1; i <= basamakSayısı; i++) {

            rakam = sayı%10;
            carpım = (int) Math.pow(rakam,basamakSayısı);
            toplam += carpım;
            sayı = sayı / 10;

        }
        System.out.println("sonuç = " + toplam );

        if(sayı == toplam){
            System.out.println("girilen sayı amstrong sayıdır");
        }else {
            System.out.println("girilen sayı amstrong sayısı değildir");
        }
    }
}
