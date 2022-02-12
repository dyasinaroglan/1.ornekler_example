package Bolum4.Arrays;

import java.util.Scanner;

public class EbobBulma {
    public static void main(String[] args) {
        int n1,n2;
        int ebob,ekok,kalan,bolunen,bolen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki sayı giriniz : (Sayılar arasında boşluk bırakınız.)");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        if (n1>n2) {
            bolunen=n1;
            bolen=n2;
        }
        else {
            bolunen=n2;
            bolen=n1;
        }
        kalan=bolunen%bolen;
        while(kalan!=0) {
            bolunen=bolen;
            bolen=kalan;
            kalan=bolunen%bolen;
        }
        ebob = bolen;
        ekok = n1*n2/ebob;
        System.out.println(n1+" ve "+n2+" bu sayıların EBOB'u = "+ebob);
        System.out.println(n1+" ve "+n2+" bu sayıların EKOK'u = "+ekok);
    }
}
