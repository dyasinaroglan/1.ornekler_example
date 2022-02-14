package Bolum8.Classes.GithubExample.Example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.dairenin alanını hesaplamak için\n" +
                "2.karenin alanını hesaplamak için\n" +
                "3.dikdörtgenin alanını hesaplamak için\n" +
                "4.programdan çıkmak için\n");
        Scanner scanner = new Scanner(System.in);
        Shapes shapes = new Shapes();
        boolean durum = true;

        while (durum){
            System.out.println("seçiminizi yapınız");
            int secim = scanner.nextInt();
            switch (secim){
                case 1 :
                    System.out.println("dairenin yarıçapını giriniz");
                    double yarıCap = scanner.nextDouble();
                    shapes.circleArea(yarıCap);
                    break;
                case 2 :
                    System.out.println("karenin kenarını giriniz");
                    double kenarUzunluk = scanner.nextDouble();
                    shapes.squareArea(kenarUzunluk);
                    break;
                case 3:
                    System.out.println("dikdörtgenin kısa kenarını giriniz");
                    double kısaKenar = scanner.nextDouble();
                    System.out.println("uzun kenarını giriniz");
                    double uzunKenar = scanner.nextDouble();
                    shapes.rectangleArea(kısaKenar,uzunKenar);
                    break;
                case 4 :
                    System.out.println("çıkış yapılıyor...");
                    durum = false;
                    break;
                default:
                    System.out.println("geçersiz tercih");
            }

        }
    }
}
