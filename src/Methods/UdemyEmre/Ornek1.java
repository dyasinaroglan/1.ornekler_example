package Methods.UdemyEmre;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        int secim = -1;
        /*while (secim !=0) {
            secim= menuYaz();
        }
         */
        for (int i = 0; i < secim; i++) {
            secim = menuYaz();
            if (secim == 0) {
                break;
            }
            Scanner scanner = new Scanner(System.in);

            System.out.println("1.sayıyı giriniz");
            int sayı1 = scanner.nextInt();
            System.out.println("2.sayıyı giriniz");
            int sayı2 = scanner.nextInt();

            switch (secim){
                case 1 : ikiSayınınCarpımı(sayı1,sayı2);
                break;
                case 2 : ikiSayınınToplamı(sayı1,sayı2);
                break;
                case 3 : ikiSayınınKuvveti(sayı1,sayı2);
                break;
                case 4: ikiSayınınToplamı(sayı1,sayı2);
                break;
            }
            System.out.println(secim);
        }

    }

    public static int menuYaz(){
        System.out.println("**********MENÜ**********");
        System.out.println("1.iki sayının çarpımı");
        System.out.println("2.iki sayının toplamını bul");
        System.out.println("3.iki sayının kuvvetini bul");
        System.out.println("4.iki double sayının toplamını bul");
        System.out.println("çıkmak için 0 tuşlayınız");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        return secim;
    }
    public static void ikiSayınınCarpımı(int num1,int num2){
        int carpım = num1*num2;
        System.out.println("çarpım =" +carpım);
    }
    public static void ikiSayınınToplamı (int num1,int num2){
        int toplam = num1+num2;
        System.out.println("toplam = "+toplam);
    }
    public static void ikiSayınınKuvveti(int num1,int num2){
        int kuvvet = (int) Math.pow(num1,num2);
        System.out.println(kuvvet);

    }
    public static void ikiSayınınToplamı(double num1,double num2){  //OVERLOADING metotlar.
        //aşırı yükleme yapılan methotlar. biz aynı isimde farklı parametre sayılarında ve farklı parametre değerlerinde methotlar
        //oluşturabiliriz. aynı sayıda parametre olursa değişken tiplerinin farklı olması gerekir.
       double toplam = num1+num2;
        System.out.println("double toplam ="+ toplam);

    }
}
