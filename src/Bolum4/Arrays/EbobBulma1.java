package Bolum4.Arrays;

import java.util.Scanner;

public class EbobBulma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz :");
        int n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int k = n1;
        int ebob = 1;
        int ekok = 1;

        while (k > 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                ekok = (n1 * n2) / ebob;
                break;
            }
            k--;


        }
        System.out.println(" Ebob : " + ebob + " Ekok : " + ekok);

    }
}
