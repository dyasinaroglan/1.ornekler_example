package Bolum2;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        /*
        ögrenci sinavdan 50 den az alirsa sinifta kalir
        50 ve 80 arasi iyi not alir
        80 ve 100 arasi pekiyi not alir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("notu giriniz");
        int not = scanner.nextInt();

        if(not<50){
            System.out.println("SINIFTA KALDI");
        }else if(not>=50 && not<80){
            System.out.println("İYİ");
        }else if (not>=80 && not<=100){
            System.out.println("PEKİYİ");
        }
        else {
            System.out.println("GEÇERSİZ NOT");
        }
    }
}
