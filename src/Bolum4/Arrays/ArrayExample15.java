package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample15 {
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

        char[][] tumOgrenciVeSoruSayısı = new char[ogrSayısı][soruSayısı];
        char[] cevapAnahtarı = new char[soruSayısı];


        cevapAnahtarıOlustur(cevapAnahtarı);
        ogrencıCevapları(tumOgrenciVeSoruSayısı);
        ogrenciCevaplarıYazdır(tumOgrenciVeSoruSayısı);
        cevapAnahtarıYazdır(cevapAnahtarı);
        ogrencıleriDegerlendır(cevapAnahtarı,tumOgrenciVeSoruSayısı);
        

        /*
        int a = 'A';
        int b = 'B';
        int c = 'C';
        int d = 'D';
        int e = 'E';
        System.out.println(a + " " + b + " " + c + " " + d + " " + " " + e);
       */

    }

    private static void cevapAnahtarıYazdır(char[] cevapAnahtarı) {
        for (char c : cevapAnahtarı) {
            System.out.print( c + "--");
        }
        System.out.println();
    }

    private static void ogrenciCevaplarıYazdır(char[][] tumOgrenciVeSoruSayısı) {
        for (int i = 0; i < tumOgrenciVeSoruSayısı.length; i++) {
            for (int j = 0; j < tumOgrenciVeSoruSayısı[i].length; j++) {
                System.out.print(tumOgrenciVeSoruSayısı[i][j] + ",");
            }
            System.out.println();
        }
    }

    private static void ogrencıleriDegerlendır(char[] cevapAnahtarı, char[][] tumOgrenciVeSoruSayısı) {
        int dogruSayısı = 0;
        for (int i = 0; i < tumOgrenciVeSoruSayısı.length; i++) {
            for (int j = 0; j < tumOgrenciVeSoruSayısı[i].length; j++) {
                if(tumOgrenciVeSoruSayısı[i][j] == cevapAnahtarı[j]){
                    dogruSayısı++;
                }
            }
            System.out.println((i+1) + ". öğrencinin doğru cevap sayısı : " + dogruSayısı);
        }
        System.out.println();
    }

    private static void cevapAnahtarıOlustur(char[] cevapAnahtarı) {
        for (int i = 0; i < cevapAnahtarı.length; i++) {
            cevapAnahtarı[i] = sıklar();

        }
    }

    private static void ogrencıCevapları(char[][] tumOgrenciVeSoruSayısı) {
        for (int i = 0; i < tumOgrenciVeSoruSayısı.length; i++) {
            for (int j = 0; j < tumOgrenciVeSoruSayısı[i].length; j++) {
                tumOgrenciVeSoruSayısı[i][j] = sıklar();
            }
            
        }
    }
    public static char sıklar(){
        int randomSıklar = 65 + (int) (Math.random()*5);
        char sıklar = (char) randomSıklar;
        return sıklar;
    }
}
