package Bolum4.Methods_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Calısma2 {
    public static void main(String[] args) {

        // kullanicidan alinan 5 adet integer sayiyi array"e atin.
        // Arrayi ekrana yazdirin
        // bunlardan tek indexlileri 1 artirin
        // cift indekslileri 0"a esitleyin
        // arrayi ekrana yazdiralim

        Scanner scanner = new Scanner(System.in);

        int[] sayılar = new int[5];
        int tekİndis =0;
        int ciftİndis=0;

        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("sayıları giriniz");
            sayılar[i]=scanner.nextInt();
            if(i%2==1){
                sayılar[i]++;
            }
            else {
                sayılar[i]=0;
            }

        }
        System.out.println(Arrays.toString(sayılar));

    }
}
