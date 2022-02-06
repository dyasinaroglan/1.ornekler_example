package Bolum4.Arrays;

import java.util.Scanner;

public class Calısma4 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane isim girmesini isteyin.
        Bu isimlerden uzunlugu 6 dan buyuk kac isim oldugunu bulun.
         */

        Scanner scanner =new Scanner(System.in);

        String[] dizi = new String[5];
        int count=0;

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("isim giriniz");
            dizi[i]=scanner.nextLine();
            if(dizi[i].length()>6){
                count++;
            }
        }
        System.out.println("toplam:"+count);
    }
}
