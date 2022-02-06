package Bolum8.Classes.ExceptionUdemyEmre;

import java.util.Scanner;

public class kendiHatalarımızıOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas = scanner.nextInt();

        try {
            if (yas<0){
                throw new ArithmeticException("yaş negatif olamaz");
            }
        }catch (ArithmeticException e){
            System.out.println("hata = "+ e);
        }
    }
}
