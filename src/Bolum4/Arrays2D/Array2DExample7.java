package Bolum4.Arrays2D;

import java.util.Scanner;

public class Array2DExample7 {
    public static void main(String[] args) {

        /*
        euro ve dolar in son 6 ayda ki karsiliklarini bir tabloya ekleyin.
        Bu tabloyu ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);

        int[][] kurTablosu = new int[6][2];

        for (int i = 0; i < kurTablosu.length; i++) {
            for (int j = 0; j < kurTablosu[i].length; j++) {
                if(j==0){
                    System.out.println("DOLAR");
                    kurTablosu[i][j] = scanner.nextInt();
                }else {
                    System.out.println("EURO");
                    kurTablosu[i][j] = scanner.nextInt();
                }
            }
        }
        ekranaYazdır(kurTablosu);
    }
    public static void ekranaYazdır(int[][] kur){
        for (int i = 0; i < kur.length; i++) {
            for (int j = 0; j < kur[i].length; j++) {
                if(j==0){
                    System.out.print("DOLAR " + kur[i][j] + " ");
                }else {
                    System.out.println("EURO " + kur[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
