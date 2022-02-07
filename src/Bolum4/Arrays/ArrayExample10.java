package Bolum4.Arrays;

import java.util.Collections;

public class ArrayExample10 {
    public static void main(String[] args) {
        int[] arr = {2,67,-5,12,66};
        sortBulma(arr);
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }
    public static void sortBulma(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j]>array[j+1]){
                swap(array,j,j+1);  //yerlerini değiştir.
                }
            }
        }
    }
    public static void swap(int[]array, int i, int j){
        int temp =  array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
