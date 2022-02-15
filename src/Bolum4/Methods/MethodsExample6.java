package Bolum4.Methods;

import java.util.Scanner;

public class MethodsExample6 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane meyve girmesini isteyin.
        Bu meyvelerden kac tanesinde e harfi oldugunu bulan bir metot yazin.
         */

        Scanner scanner = new Scanner(System.in);

        String[] meyveler = new String[5];
        for (int i = 0; i < meyveler.length; i++) {
            System.out.println("meyve isimlerini giriniz");
            String meyveIsımlerı = scanner.nextLine();
            meyveler[i] = scanner.nextLine();
        }
        int kacEvar = eMiktarı(meyveler);
        System.out.println("kaç tanesinde e var = " + kacEvar);

    }
    public static int eMiktarı (String[] array){
        int miktar = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("e")){
                miktar++;
            }
        }
        return miktar;



    }
}
