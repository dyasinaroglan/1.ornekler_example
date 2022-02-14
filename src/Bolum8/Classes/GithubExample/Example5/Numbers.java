package Bolum8.Classes.GithubExample.Example5;

import java.util.Scanner;

public class Numbers {

    int size;
    int[] arr;    // arr dizimizi methodun içinde değil dışarda tanımaldık.çünkü diğer methotlar ile de
    //bu dizimizi kullanacağız.

    public Numbers(int size) {
        this.size = size;
    }
    public void getNumbers(){
        arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    public void swap(){
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < size; i++) {
            if(arr[maxIndex]<arr[i]){
                maxIndex = i;
            }if (arr[minIndex]>arr[i]){
                minIndex = i;
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("büyük rakam ile küçük rakamı değiştirdik");
        }
    }
    public void disPlay(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
