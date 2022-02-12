package Bolum4.Arrays2D;

import java.util.Scanner;

public class Array2DExample {
    public static void main(String[] args) {
        /*
        20 öğrencinin 10 adet soruya verdiği cevapları tutan bir matris düzenleyin.
        Öğrencilerin soruya verdiği cevapları tutan bir matris oluşturun
        bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. sonrasında bu değerleri karşılaştırarak
        her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("öğrenci sayısını giriniz");
        int ogrSayısı = scanner.nextInt();
        System.out.println("soru sayısını giriniz");
        int soruSayısı = scanner.nextInt();

        char[][] ogrSayısıVeSoruSayısı = new char[ogrSayısı][soruSayısı]; //bunlar char çünkü her bir elemanında karakter var.
        char[] cevapAnahtarı = new char[soruSayısı];

        cevapAnahtarı(cevapAnahtarı);
        ogrCevapları(ogrSayısıVeSoruSayısı);
        ogrCevaplarıYazdır(ogrSayısıVeSoruSayısı);
        System.out.println("***************");
        cevapAnahtarıYazdır(cevapAnahtarı);
        ogrDegerlendır(ogrSayısıVeSoruSayısı,cevapAnahtarı);



    }
    public static int sıklar(){
        int randomSıklar = 65 + (int) (Math.random()*5);
        char sıklar = (char) randomSıklar;
        return sıklar;
    }
    public static void ogrCevapları(char[][] ogrSayısıVeSoruSayısı){
        for (int i = 0; i < ogrSayısıVeSoruSayısı.length; i++) {
            for (int j = 0; j < ogrSayısıVeSoruSayısı[i].length; j++) {
                 ogrSayısıVeSoruSayısı[i][j] = (char) sıklar();
            }
        }
    }
    public static void cevapAnahtarı(char[] cevapAnahtarı){
        for (char i = 0; i < cevapAnahtarı.length; i++) {
            cevapAnahtarı[i] = (char) sıklar();
        }
    }
    public static void ogrDegerlendır(char[][] ogrSayısıVeSoruSayısı, char[] cevapAnahtarı){
        for (int i = 0; i < ogrSayısıVeSoruSayısı.length; i++) {
            int dogruSayısı = 0;
            for (int j = 0; j < ogrSayısıVeSoruSayısı[i].length; j++) {
               if(ogrSayısıVeSoruSayısı[i][j] == cevapAnahtarı[j]){
                   dogruSayısı++;
               }
            }
            System.out.println((i+1) + ". öğrencinin doğru cevap sayısı : " + dogruSayısı);
        }
        System.out.println();
    }
    public static void ogrCevaplarıYazdır(char[][] ogrSayısıVeSoruSayısı){
        System.out.println("öğrenci cevapları");
        for (int i = 0; i < ogrSayısıVeSoruSayısı.length; i++) {
            for (int j = 0; j < ogrSayısıVeSoruSayısı[i].length; j++) {
                System.out.print(ogrSayısıVeSoruSayısı[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static void cevapAnahtarıYazdır(char[] cevapAnahtarı){
        for (char c : cevapAnahtarı) {
            System.out.print(c + ",");
        }
        System.out.println();
        }
    }

