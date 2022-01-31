package Bolum2.Sorular;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        /*
        klavyeden girilen vize ve final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen bir uygulama yazınız
        (geçme notu: 50  vizenin %40'ı, final'in %60 ı geçerlidir.)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("vize notunu giriniz");
        double vizeNotu = scanner.nextDouble();
        System.out.println("final notunu giriniz");
        double finalNotu = scanner.nextDouble();

        double vizeEtki = vizeNotu * 0.4;
        double finalEtki = finalNotu * 0.6;

        double toplamNot = vizeEtki + finalEtki;
        if (toplamNot >= 50 && toplamNot <= 100) {
            System.out.println("geçtiniz..! ortalamanız " + toplamNot);
        } else {
            System.out.printf("kaldınız..! ortalamanız %.2f = " ,toplamNot);
        }
    }
}


