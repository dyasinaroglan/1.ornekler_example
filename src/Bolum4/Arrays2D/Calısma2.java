package Bolum4.Arrays2D;

import java.util.Scanner;

public class Calısma2 {
    public static void main(String[] args) {
        /*
        ögrencilerin vize ve final notlarini girebilecegi
        bir program yazin. Kac ögrenci olacagini da kullanıcıdan alin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç öğrenci");
        int ogrSayısı = scanner.nextInt();

        int[][] notlarTablosu = new int[ogrSayısı][2];

        for (int i = 0; i < notlarTablosu.length; i++) {
            for (int j = 0; j < notlarTablosu[i].length; j++) {
                if(j==0){
                    System.out.println((i+1)+" öğrenci"+"vize notu");
                    notlarTablosu[i][j]= scanner.nextInt();
                }
                else {
                    System.out.println((i+1)+" öğrenci"+"final notu");
                    notlarTablosu[i][j]=scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < notlarTablosu.length; i++) {
            for (int j = 0; j < notlarTablosu[i].length; j++) {
                if (j==0){
                    System.out.println((i+1)+" öğrenci "+"vize notu: "+ notlarTablosu[i][j]);
                }
                else {
                    System.out.println((i+1)+" öğrenci "+"final notu: "+ notlarTablosu[i][j]);
                }
            }
        }
    }
}
