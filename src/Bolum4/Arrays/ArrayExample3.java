package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {

        /*
        Kullanicidan 5 tane sayi alin ve bu sayilarin tek olanlarini sayisini bulun
         */

        Scanner scanner = new Scanner(System.in);
        int tekToplam = 0;

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
            array[i] = scanner.nextInt();
            if(array[i]%2 == 1){
                tekToplam++;
            }
        }
        System.out.println("array içindeki tek numaraların sayısı = " + tekToplam);

    }
}
