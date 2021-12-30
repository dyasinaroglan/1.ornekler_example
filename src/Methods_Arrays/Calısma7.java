package Methods_Arrays;

import java.util.Scanner;

public class Calısma7 {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç öğrenci olduğunu giriniz");
        int kacOgr = scanner.nextInt();

        int [][] notlar =notGiris(kacOgr);
        notYazdır(notlar);



    }
    public static int[][] notGiris(int kacOgr){
        int[][] notlar = new int[kacOgr][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if(j==0){
                    System.out.println("vize sonucu girin");
                    notlar[i][j]= scanner.nextInt();
                }
                else {
                    System.out.println("final sonucu girin");
                    notlar[i][j]=scanner.nextInt();
                }

            }

        }
        return notlar;
    }
    public static void notYazdır(int[][]notlar){
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if(j==0){
                    System.out.println("vize:"+notlar[i][j]);
                }
                else {
                    System.out.println("final:"+notlar[i][j]);
                }

            }

        }
    }
}
