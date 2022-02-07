package Bolum4.Arrays;

import java.util.Arrays;

public class ArrayExample8 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 8;
        arr[1] = 12;
        arr[2] = 4;
        arr[3] = 34;
        printArray(arr);
        System.out.println();
        String[] shoppingList = {"BANANAS","APPLES","PEARS"};
        printArray2(shoppingList);

        int[] array1;
        int[] array2 = {4,67,8};
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println();
        Arrays.sort(arr); //küçükten büyüğe sıralar.
        printArray(arr);
        System.out.println();
        printArray(array2);
    }

    public static void printArray(int[] array){
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            int sayılar = array[i];
            System.out.print(sayılar);
            if(i<array.length-1){
                System.out.print(",");
            }

        }
        System.out.print("|");
    }
    public static void printArray2(String[] array){
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            String kelimeler = array[i];
            System.out.print(kelimeler);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.print("|");
    }
}
