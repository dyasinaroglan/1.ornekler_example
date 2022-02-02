package Bolum2.Sorular;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        //Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0 a bastığında girdiği sayıların
        //çarpımını sonuç olarak gösteren programı yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        int carpım = 1;
        boolean cık = true;
        while (sayı != 0){
            carpım*= sayı;
            System.out.println("sayı giriniz");
            sayı = scanner.nextInt();
            cık = false;
            }
        if (cık){
            System.out.println("uygulamadan çıktınız");
        }else {
            System.out.println("çarpım sonucu = " + carpım);

        }
        }
    }
