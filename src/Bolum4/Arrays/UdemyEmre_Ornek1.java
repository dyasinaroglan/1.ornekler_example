package Bolum4.Arrays;

import java.util.Scanner;

public class UdemyEmre_Ornek1 {
    public static void main(String[] args) {
        /*
        kullanıcıdan hangi ayda olduğunun bilgisini alıp ilgili ay değerini yazdırın.
        ay adlarını bir dizide saklayın.
         */
       String[] array = {"OCAK","ŞUBAT","MART","NİSAN","MAYIS","HAZİRAN","TEMMUZ","AĞUSTOS","EYLÜL","EKİM","KASIM","ARALIK"};
       Scanner scanner =new Scanner(System.in);
        System.out.println("bulunduğunuz ay'ı rakam ile giriniz");
        int ay = scanner.nextInt();

        System.out.println("bulunduğunuz ay = "+ array[ay-1]);

    }
}
