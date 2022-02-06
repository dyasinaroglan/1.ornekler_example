package Bolum4.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Calısma15 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alin ve en büyük sayiyi ekrana yazdirin
         */
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
             array[i] = scanner.nextInt();
        }
            Arrays.sort(array);
            int enb = array[array.length-1];
            System.out.print(enb+" ");

    }
}
