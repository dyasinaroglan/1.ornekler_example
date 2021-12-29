package Arrays;

import java.util.Scanner;

public class Calısma10 {
    public static void main(String[] args) {
        /*
        Kullanicidan 3 tane sayi girmesini isteyin.
        Bu sayilardan yüzler basamagi en büyük olan sayiyi bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int enb = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
            array[i] = scanner.nextInt();    //dizimi oluşturdum.
            for (int sayı = 0; sayı < array.length; sayı++) {
                int yüzler = (sayı / 100) % 10;   //birler basamağını verir.
                if (yüzler > enb){
                    enb = yüzler;
            }
        }
    }
        System.out.println("enb:"+enb);
    }
}
