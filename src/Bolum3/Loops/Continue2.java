package Bolum3.Loops;

import java.util.Scanner;

public class Continue2 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 pozitif tam sayi girmesini isteyin.
        Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulun.
        Bu soruda continue kullanin.
         */

        Scanner scanner = new Scanner(System.in);
        int hak = 0;
        int toplam = 0;
        while (hak<5){
            System.out.println("sayıyı giriniz");
            int sayı = scanner.nextInt();
            if(sayı>=5 && sayı<=10){
                continue;
            }else {
                toplam+= sayı;
            }
            System.out.println("toplam : "+ toplam);
        }
    }
}
