package Methods_Arrays;

import java.util.Scanner;

public class Calısma6 {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac ögrencinin notunu girmak istiyorsunuz?");
        int ogrSayisi = scanner.nextInt();
        int[][] kacOgr = notlarGiris(ogrSayisi);

    }
    public static int[][] notlarGiris(int kacOgr){
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[kacOgr][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j==0){
                    System.out.println("vize notu");
                    array[i][j]= scanner.nextInt();

                }
                else {
                    System.out.println("final notu");
                    array[i][j]=scanner.nextInt();
                }
            }
        }
        return array;
    }
    public static void notYazdır (int[][] notlar) {
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if (j == 0) {
                    System.out.println("vize:" + notlar[i][j]);
                } else {
                    System.out.println("final:" + notlar[i][j]);
                }
            }
        }
    }
}
