package Arrays;

import java.util.Scanner;

public class Calısma3 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int enb=1;

        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
            array[i]= scanner.nextInt();
            if(array[i]>enb){
                enb=array[i];
            }
        }
        System.out.println("enb:"+enb);

    }

}

