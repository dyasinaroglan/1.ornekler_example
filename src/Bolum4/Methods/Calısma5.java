package Bolum4.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Calısma5 {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */
        Scanner scanner = new Scanner(System.in);
        String sayıBosluk = scanner.nextLine();
        String[] array = sayıBosluk.split(" ");

        int[] sayılar = new int[array.length];
        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i]= Integer.parseInt(array[i]);
        }

        enb(sayılar);
        enk(sayılar);


    }
    public static void enb(int[] nums){
        Arrays.sort(nums);
        System.out.println("en büyük sayı="+nums[nums.length-1]);
    }
    public static void enk(int[] nums){
        Arrays.sort(nums);   //arrays.sort küçükten büyüğe sıralar
        System.out.println("en küçük sayı ="+nums[0]); //numsun en küçük değeri artık 0.indistir.
    }
}
