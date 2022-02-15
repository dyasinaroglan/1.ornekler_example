package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample8 {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç öğrenci olduğunu giriniz");
        int ogrSayısı = scanner.nextInt();
        int[][] notlar = notGir(ogrSayısı);
        notYazdır(notlar);

    }
    public static int[][] notGir(int ogrSayısı) {
        Scanner scanner = new Scanner(System.in);

        int[][] notlarTablosu = new int[ogrSayısı][2];
        for (int i = 0; i < notlarTablosu.length; i++) {
            for (int j = 0; j < notlarTablosu[i].length; j++) {
                if (j == 0) {
                    System.out.println("vize sonucu girin");
                    notlarTablosu[i][j] = scanner.nextInt();
                }else {
                    System.out.println("final notunu girin");
                    notlarTablosu[i][j] = scanner.nextInt();
                }
            }
        }
        return notlarTablosu;
    }
    public static void notYazdır(int[][] notlar){
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if(j==0){
                    System.out.println("vize = " + notlar[i][j]);
                }else {
                    System.out.println("final = " + notlar[i][j]);
                }

            }

        }

    }
}
