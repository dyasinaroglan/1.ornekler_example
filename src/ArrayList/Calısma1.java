package ArrayList;

import java.util.Scanner;

public class Calısma1 {
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
        int secim;
        do {
            menüYaz();
            System.out.println("menüyü seçiniz");
            secim=scanner.nextInt();
            islemYap(secim);

        }while (secim<6);

    }
    public static void menüYaz(){
        System.out.println("***MENÜ***");
        System.out.println("1.toplama");
        System.out.println("2.çıkarma");
        System.out.println("3.çarpma");
        System.out.println("4.bölme");
        System.out.println("5.faktörşyel");
        System.out.println("6.çıkış");
    }
    public static void islemYap(int islem){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        switch (islem){
            case 1:
                System.out.println("1.sayıyı girin");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı girin");
                num2= scanner.nextInt();
                toplama(num1,num2);
                break;
            case 2:
                System.out.println("1.sayıyı girin");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı girin");
                num2=scanner.nextInt();
                cıkarma(num1,num2);
                break;
            case 3:
                System.out.println("1.sayıyı girin");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı girin");
                num2=scanner.nextInt();
                carpma(num1,num2);
                break;
            case 4:
                System.out.println("1.sayıyı girin");
                num1= scanner.nextInt();
                System.out.println("2.sayıyı girin");
                num2=scanner.nextInt();
                bolme(num1,num2);
                break;
            case 5:
                System.out.println("sayıyı giriniz");
                num1=scanner.nextInt();
                faktöriyel(num1);
                break;


        }

    }
    public static void toplama(int num1,int num2){
        System.out.println("toplama:"+num1+num2);
    }
    public static void cıkarma(int num1,int num2){
        System.out.println("çıkarma:"+ (num1-num2));
    }
    public static void carpma(int num1,int num2){
        System.out.println("çarpma:"+ num1*num2);
    }
    public static void bolme(int num1,int num2){
        if(num2>0){
            System.out.println("bolme:"+(num1/num2));
        }
        else {
            System.out.println("tanımsız");
        }
    }
    public static void faktöriyel(int num1){
        int faktöriyel=1;
        for (int i = 1; i <= num1; i++) {
            faktöriyel*=i;
        }
        System.out.println("faktöriyel:"+faktöriyel);
    }
}
