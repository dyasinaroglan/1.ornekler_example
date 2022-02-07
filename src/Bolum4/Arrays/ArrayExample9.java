package Bolum4.Arrays;

import java.util.Arrays;

public class ArrayExample9 {
    public static void main(String[] args) {

        int[] arrayInt = new int[] {1,2,4,6,7};
        String[] arrayString = new String[] {"ALİ","VELİ","YASİN"};

        System.out.println(Arrays.toString(arrayInt));

        System.out.println(Arrays.toString(arrayString));

        Arrays.stream(arrayInt).forEach(System.out :: print);
        System.out.println();
        Arrays.stream(arrayString).forEach(System.out ::print);
    }
}
