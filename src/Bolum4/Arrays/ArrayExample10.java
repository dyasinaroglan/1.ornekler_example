package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample10 {
    public static void main(String[] args) {
        //5 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 1; i < array.length; i++) {
           array[i] = (int) Math.pow(i,2);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.println("eleman : " + array[i]);
            
        }
    }
}
