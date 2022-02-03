package Bolum3.Loops;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        /*
        baslangic ve bitis degerini kullanicidan alarak bu araliktaki sayilarin toplamini
        ekrana yazdirin. (sayilar dahil)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("başlangıç değerini girin");
        int baslangıc = scanner.nextInt();
        System.out.println("bitiş değerini girin");
        int bitis = scanner.nextInt();
        int toplam = 0;
        if (baslangıc < bitis) {
            for (int i = baslangıc; i <= bitis; i++) {
                toplam += i;
            }
            System.out.println("toplam = " + toplam);
        }else {
            for (int j = bitis; j <= baslangıc; j++) {
                toplam+=j;
            }
            System.out.println("toplam = " + toplam);
        }
    }
}
