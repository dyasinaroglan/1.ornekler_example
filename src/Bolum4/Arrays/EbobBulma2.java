package Bolum4.Arrays;

import java.util.Scanner;

public class EbobBulma2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n1 giriniz");
        int n1=sc.nextInt();
        System.out.println("n2 giriniz");
        int n2=sc.nextInt();
        int ebob=1, ekok;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);
    }
}
