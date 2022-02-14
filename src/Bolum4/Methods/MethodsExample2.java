package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample2 {
    public static void main(String[] args) {
        /*
        6 elemanli bir sayi dizisi olusturun ve bu dizideki tek ve cift eleman
        sayisini bulan bir metot yazin.
         */
        tekMıCıftMı();
    }

    public static void tekMıCıftMı(){
        int tekToplam = 0;
        int ciftToplam = 0;
        Scanner scanner = new Scanner(System.in);
        int[] sayılar = new int[6];
        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i] = scanner.nextInt();
            }
        for (int i = 0; i < sayılar.length; i++) {
            if(sayılar[i]%2 == 0){
                ciftToplam++;
            }else {
                tekToplam++;
            }
        }
        System.out.println("tek toplam = " + tekToplam);
        System.out.println("çift toplam = " + ciftToplam);
        }
    }

