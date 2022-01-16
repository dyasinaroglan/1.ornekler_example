package Arrays;

import java.util.Scanner;

public class UdemyEmre_Ornek2 {
    public static void main(String[] args) {
        /*
        kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini sorun ve buna bağlı olarak aldığınız değerleri
        bir dizide saklayın. veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını ekrana yazdırın.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("dizi içerisinde kaç sayı tutmak istiyorsunuz");
        int sayı = scanner.nextInt();

        double toplam =0;

        int[] array = new int[sayı];
        for (int i = 0; i < array.length; i++) {
           array[i]= scanner.nextInt();
           toplam += array[i];
        }
        System.out.println("girdiğiniz sayıların ortalaması = "+ (toplam/array.length));

    }
}
