package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample11 {
    public static void main(String[] args) {
        /*
        kullanıcıdan hangi ay da olduğunu bilgisini alıp ilgili ay değerini yazdırın.
        ay adlarını bir dizide saklayın.
         */
        Scanner scanner = new Scanner(System.in);
        String[] aylar = {"OCAK","ŞUBAT","MART","NİSAN","MAYIS","HAZİRAN","TEMMUZ","AĞUSTOS","EYLÜL","EKİM","KASIM","ARALIK"};
        System.out.println("nulunduğunuz ayı rakam olarak giriniz");
        int i = scanner.nextInt();

        System.out.println("seçtiğiniz ay : " + aylar[i-1]);
    }
}
