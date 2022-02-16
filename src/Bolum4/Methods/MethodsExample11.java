package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample11 {
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
        int secim ;
        do {
            menu();
            System.out.println("işlem seçiniz");
            secim = scanner.nextInt();
            islem(secim);
        }while (secim<6) ;
        }

    public static void toplama(int sayı1, int sayı2){
        int toplam = sayı1+sayı2;
        System.out.println("toplam = " + toplam);
        System.out.println();
        System.out.println("*************");
        System.out.println("*************");
    }
    public static void cıkarma(int sayı1, int sayı2){
        int cıkarma = sayı1-sayı2;
        System.out.println("çıkarma = " + cıkarma);
        System.out.println();
        System.out.println("**************");
        System.out.println("**************");
    }
    public static void carpma(int sayı1,int sayı2){
        int carpım = sayı1*sayı2;
        System.out.println("çarpım = " + carpım);
        System.out.println();
        System.out.println("************");
        System.out.println("*************");
    }
    public static void bolme(double sayı1, double sayı2){
        if(sayı2 == 0){
            System.out.println("bölünemez, tanımsız");
        }else {
            System.out.printf("bölme = " + "%.2f" , sayı1/sayı2);
            System.out.println();
            System.out.println("*************");
            System.out.println("**************");
        }
    }
    public static void faktöriyel(int num){
        int faktöriyel = 1;
        for (int i = 1; i < num; i++) {
            faktöriyel*= i;
        }
        System.out.println("faktöriyel = " + faktöriyel);
        System.out.println();
        System.out.println("*************");
        System.out.println("*************");
    }
    public static void menu(){
        System.out.println("1.toplama\n" +
                "2.çıkarma\n" +
                "3.çarpma\n" +
                "4.bölme\n" +
                "5.faktöriyel\n" +
                "6.çıkış\n");
    }
    public static void islem(int islem){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        switch (islem){
            case 1:
                System.out.println("1.sayıyı giriniz");
                num1 = scanner.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                num2 = scanner.nextInt();
                toplama(num1,num2);
                break;
            case 2:
                System.out.println("1.sayıyı giriniz");
                num1 = scanner.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                num2 = scanner.nextInt();
                cıkarma(num1,num2);
                break;
            case 3:
                System.out.println("1.sayıyı giriniz");
                num1 = scanner.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                num2 = scanner.nextInt();
                carpma(num1,num2);
                break;
            case 4 :
                System.out.println("1.sayıyı giriniz");
                num1 = scanner.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                num2 = scanner.nextInt();
                bolme(num1,num2);
                break;
            case 5:
                System.out.println("sayıyı giriniz");
                num1 = scanner.nextInt();
                faktöriyel(num1);
                break;
            default:
                System.out.println("tanımsız işlem");
        }


    }
}
