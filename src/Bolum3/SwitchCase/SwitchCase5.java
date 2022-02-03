package Bolum3.SwitchCase;

import java.util.Scanner;

public class SwitchCase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***SELAMLAŞMA ÇEŞİTLERİ");
        System.out.println("************************");
        System.out.println("1.Hİ\n2.HEYY\n3.HELLO\n4.SELAM");
        System.out.println("************************");

        int choice;
        System.out.println("sizin selamlaşma tercihiniz nedir?");
        choice = scanner.nextInt();
        switch (choice){
            case 1 :
                System.out.println("hi");
                break;
            case 2 :
                System.out.println("heyy");
                break;
            case 3 :
                System.out.println("hello");
                break;
            case 4 :
                System.out.println("selam");
                break;
            default:
                System.out.println("geçersiz selamlaşma");
        }
    }
}
