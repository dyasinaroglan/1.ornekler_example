package Bolum4.Arrays2D;

import java.util.Scanner;

public class Array2DExample2 {
    public static void main(String[] args) {
        /*
        soru1:
        Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
        Bu ögrencilere seviye belirleme sinavi yaptiniz.
        Aldiklari sonuclar su sekildedir: 56,65,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:

        ögrenci abdullah sinavdan 80 almistir.
        ögrenci cihat sinavdan 85 almistir.
        ögrenci fatma sinavdan 90 almistir.
        ögrenci harun sinavdan 96 almistir.
        ögrenci yasin sinavdan 100 almistir.
         */
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        //iki defa yazmamızın sebebi String bir ifadeden sonra ınt bir ifade gelecek. hatayı önlemek için

        String[] isimVeSoyisim = new String[5];
        int[] notlar = new int[5];

        for (int i = 0; i < isimVeSoyisim.length; i++) {
            System.out.println("isim ve soyisim giriniz");
            String bilgiler = scannerStr.nextLine();
            isimVeSoyisim[i] = bilgiler;
            System.out.println("notları giriniz");
            int notYaz = scannerInt.nextInt();
            notlar[i] = notYaz;
        }
        for (int i = 0; i < isimVeSoyisim.length; i++) {
            System.out.println(isimVeSoyisim[i] + " isimli öğrenci sınavdan " + notlar[i] + " almıştır.");

        }
    }
}
