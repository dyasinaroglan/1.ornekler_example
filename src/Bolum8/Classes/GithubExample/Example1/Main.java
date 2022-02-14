package Bolum8.Classes.GithubExample.Example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kutunun uzunluğunu giriniz");
        double lenght = scanner.nextDouble();
        System.out.println("kutunun genişliğini giriniz");
        double width = scanner.nextDouble();
        System.out.println("kutunun yüksekliğini giriniz");
        double heihht = scanner.nextDouble();
        scanner.close();

        Box b1 = new Box(lenght,width,heihht);
        System.out.println("kutunun hacmi = " + String.format("%.2f" , b1.volume()));


    }
}
