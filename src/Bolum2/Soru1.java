package Bolum2;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1
                    Kullanıcıdan aldığınız değerlere göre vücut kitle endeksini hesaplayınız.
                    Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)
                    Sonuclar

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        double kılo = scanner.nextDouble();
        System.out.println("boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vücutKıtleEndexi = kılo/boy;
        System.out.println("vücut kitle endeksi = "+ vücutKıtleEndexi);

        if(vücutKıtleEndexi<15){
            System.out.println("çok ciddi derecede düşük kilolu");
        }else if(vücutKıtleEndexi<=30){
            System.out.println("ciddi derecede düşük kilolu");
        }else if (vücutKıtleEndexi<50){
            System.out.println("normal sağlıklı kilolu");
        }else if(vücutKıtleEndexi<55){
            System.out.println("obez");
        }else {
            System.out.println("çok ciddi obez");
        }
    }
}
