package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Calısma6 {
    public static void main(String[] args) {
        /*
        Kullanicidan 10 tane sayi girmesini isteyin. Bu sayiları bir dizinin içerisine atın
        cift sayi olanlari bir ArrayList in icerisine atin. ciftSayilar() diye bir metot olusturun.
         */
        Scanner scanner = new Scanner(System.in);
        int[] sayılar = new int[10];


        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("sayı giriniz");
            sayılar[i]=scanner.nextInt();
        }
        System.out.println(ciftSayı(sayılar));
        System.out.println(tekSayı(sayılar));
    }
    public static ArrayList<Integer> ciftSayı(int[] sayılar){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sayılar.length; i++) {
            if(sayılar[i]%2==0){
                list.add(sayılar[i]);
            }
        }
        return list;
    }
    public static ArrayList<Integer> tekSayı(int[]sayılar){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sayılar.length; i++) {
            if(sayılar[i]%2==0);
            list.add(sayılar[i]);
        }
        return list;
    }
}
