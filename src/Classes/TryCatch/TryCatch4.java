package Classes.TryCatch;

import java.util.Scanner;

public class TryCatch4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayı1 = scanner.nextInt();
        int sayı2 = scanner.nextInt();


        try {
            System.out.println(sayı1/sayı2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()); //sadece mesajını yazdır. by zero
            e.printStackTrace();
        }
    }
}
