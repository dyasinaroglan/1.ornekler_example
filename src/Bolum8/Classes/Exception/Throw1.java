package Bolum8.Classes.Exception;

import java.util.Scanner;

public class Throw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ben kendim hata üretmek istiyorsam yani sayının 5 ile 10 arasında değil de başka bir sayı olmasından dolayı
        //bir hata olmasını istiyorsam THROW kullanıyorum.

        try {
            System.out.println("5 ile 10 arasında sayı giriniz : ");
            int sayı1 = scanner.nextInt();
            if (sayı1 < 5) {
                throw new ArithmeticException("5'ten küçük olma hatası\n");
            }
            if (sayı1 > 10) {
                throw new Exception("10'dan büyük olma hatası");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+"sayı 5'ten küçük olmamalı");
        }catch (Exception e){
            System.out.println(e.getMessage()+"sayı 10'dan büyük olmamalı");
        }

    }
}
