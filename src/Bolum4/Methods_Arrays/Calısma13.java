package Bolum4.Methods_Arrays;

import java.util.Scanner;

public class Calısma13 {
    public static void main(String[] args) {
        /*
         Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
         her bir menü elemanını değer alan bir fonksiyon yazınız.
            1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
         Bir işlem seçiniz
         */
        Scanner scanner = new Scanner(System.in);
        int islem;
        do {
            menuYaz();
            System.out.println("işlem seçin");
            islem=scanner.nextInt();
            islemYap(islem);

        }while (islem>6);

    }
    public static void menuYaz(){
        System.out.println("***MENÜ***");
        System.out.println("1.TOPLAMA");
        System.out.println("2.ÇIKARMA");
        System.out.println("3.ÇARPMA");
        System.out.println("4.BÖLME");
        System.out.println("5.FAKTÖRİYEL");
        System.out.println("6.ÇIKIŞ");
    }
    public static void toplama(int sayı1,int sayı2){
        System.out.println("toplam:"+sayı1+sayı2);
    }
    public static void cıkarma(int sayı1,int sayı2){
        System.out.println("çıkarma:"+(sayı1-sayı2));
    }
    public static void carpma(int sayı1,int sayı2){
        System.out.println("çarpma:"+ (sayı1*sayı2));
    }
    public static void bolme(int sayı1,int sayı2){
        if(sayı2>0){
            System.out.println("bölme:"+sayı1/sayı2);
        }
        else {
            System.out.println("tanımsız");
        }
    }
    public static void faktöriyel(int sayı1){
        int faktöriyel=1;
        for (int i = 1; i <= sayı1; i++) {
            faktöriyel*= i;
            System.out.println("faktmriyel:"+ faktöriyel);
        }
    }
    public static void islemYap(int islem){
        Scanner scanner = new Scanner(System.in);
        int sayı1,sayı2;
        switch (islem){
            case 1:
                System.out.println("1.sayıyı giriniz");
                sayı1=scanner.nextInt();
                System.out.println("2.sayıyı giriniz");
                sayı2=scanner.nextInt();
                toplama(sayı1,sayı2);
            case 2:
                System.out.println("1.sayıyı giriniz");
                sayı1=scanner.nextInt();
                System.out.println("2.sayıyı giriniz");
                sayı2=scanner.nextInt();
                cıkarma(sayı1,sayı2);
            case 3:
                System.out.println("1.sayıyı giriniz");
                sayı1=scanner.nextInt();
                System.out.println("2.sayıyı giriniz");
                sayı2=scanner.nextInt();
                carpma(sayı1,sayı2);
            case 4:
                System.out.println("1.sayıyı giriniz");
                sayı1=scanner.nextInt();
                System.out.println("2.sayıyı giriniz");
                sayı2=scanner.nextInt();
                bolme(sayı1,sayı2);
            case 5:
                System.out.println("sayıyı giriniz");
                sayı1=scanner.nextInt();
                faktöriyel(sayı1);
        }

    }

}
