package Classes.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01MultiCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();

        try {
            System.out.println(sayı1+"/"+sayı2+"="+sayı1/sayı2);
        }catch (ArithmeticException e){
            System.out.println("sayı sıfıra bölünmez");
        }catch (InputMismatchException e){
            System.out.println("sayı girmelisiniz");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
