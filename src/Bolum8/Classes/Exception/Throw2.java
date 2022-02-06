package Bolum8.Classes.Exception;

import java.io.IOException;
import java.util.Scanner;

public class Throw2 {
    public static void main(String[] args) {

        /*
        girilen sayı çift ise ve 3 ile bölünüyor ise iki farklı hata throw edip yakalayın.
        hata yok ise karekökünü ekrana yazdırın.
        hatasız girinceye kadar döngü devam etsin.

         */
        Scanner scanner = new Scanner(System.in);
        int sayı = scanner.nextInt();

        while (true){
            try {
                if(sayı%2==0){
                    throw new ArithmeticException("ÇİFT SAYI HATASI");
                }
                if (sayı%3 ==0){
                    throw  new IOException("3'E BÖLÜNME HATASI");
                }
                System.out.println("karakökü = "+ Math.sqrt(sayı));
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage()+"olmamalı");
            }catch (IOException e){
                System.out.println(e.getMessage()+"hiç olmamalı");
            }catch (Exception e){
                System.out.println(e.getMessage()+"bu hiç olmadıı");
                scanner.nextLine();
            }
        }
    }
}
