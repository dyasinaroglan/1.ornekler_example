package Bolum4.Arrays;

import java.util.Arrays;

public class Calısma11 {
    public static void main(String[] args) {
        /*
        5 elamanli bir dizi olusturun ve elemanlari kucukten büyüge siralayin.
         */

        int[] sayılar = {45,6,12,78,5};

            System.out.println(Arrays.toString(sayılar));
            Arrays.sort(sayılar);

        System.out.println(Arrays.toString(sayılar));
        System.out.println("---------------------");

        int[] dizi = {34,6,89,1,31};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        String[] name = {"yasin","mahmut","osman"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name)); //alfabetik sıralama
    }
}
