package Bolum2.Sorular;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        /*
        Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        sonra bulduğunu belirtelim.
        */

        Scanner scanner = new Scanner(System.in);
        int randomSayı = (int) (Math.random()*100)+1;
        int count = 0;

        while (true) {
            System.out.println("sayı giriniz");
            int sayı = scanner.nextInt();

            if(sayı != randomSayı){
                if(sayı>randomSayı){
                    System.out.println("SAYIYI AZALT");
                    count++;
                }else {
                    System.out.println("SAYIYI ARTTIR");
                    count++;
                }
            }else {
                System.out.println("TEBRİKLER KAZANDINIZ");
                count++;
                System.out.println("TEBRİKLER " + count + " SEFERDE BULDUNUZ");
            }
        }
    }
}
