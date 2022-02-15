package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample7 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sehir, 5 tane isim ve 5 tane meyve girmesini
        isteyin. Bunlardan kac tanesinde e harfi oldugunu bulun.
                 */
        int meyve = eMiktarı("meyveleri girin");
        int isim = eMiktarı("isimleri giriniz");
        int sehir = eMiktarı("şehirleri giriniz");

        System.out.println("meyve = " + meyve);
        System.out.println("isim = " + isim);
        System.out.println("sehir = " + sehir);

    }

    public static int eMiktarı (String str){
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        int miktar = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(str);
            array[i] = scanner.nextLine();
            if(array[i].contains("e")){
                miktar++;
            }
        }
        return miktar;
    }
}
