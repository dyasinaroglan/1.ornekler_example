package Bolum3.Loops;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int i = 0;
        int j = 10;


        for (; i<10 && j>0; i++,j-- );
        System.out.println("i = " + i );
        System.out.println("j = " + j);

        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        int faktöriyel = 1;

        for (int k = 1; k <= sayı; k++) {
            faktöriyel*= k;
        }
        System.out.println(faktöriyel);
    }
}
