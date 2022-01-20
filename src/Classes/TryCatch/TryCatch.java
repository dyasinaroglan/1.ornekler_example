package Classes.TryCatch;

import classesExample.task3.Student;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("*************************");
                System.out.println("DAİRE VE ÇEMBERİN ALANINI HESAPLAYAN PROGRAM");
                System.out.println("DAİRE YARIÇAPINI GİRİN :");
                double r = scanner.nextDouble();
                double alan = Math.PI * r * r;
                System.out.println("ALAN = " + alan);
                System.out.println("**************************");
                System.out.println("ÇEMBERİN YARIÇAPINI GİRİN");
                double R = scanner.nextDouble();
                double cemberAlan = 4 * Math.PI * R * R;
                System.out.println("ÇEMBERİN ALANI: " + cemberAlan);
                System.out.println("***************************");
                break;

            } catch (Exception e) {
                System.out.println("LÜTFEN BİR NUMARA GİRİNİZ");
            } finally {
                System.out.println("PROGRAMI KULLANDIĞINIZ İÇİN TEŞEKKÜR EDERİM");
                System.exit(0);
            }
        }
    }

}
