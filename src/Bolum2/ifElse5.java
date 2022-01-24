package Bolum2;

import java.util.Scanner;

public class ifElse5 {
    public static void main(String[] args) {
        /*
        Kullanicidan ders ve aldigi notu alin. Mat: 90 seklinde
        >= 90 icin A
        >= 80 icin B
        >= 70 icin C
        >= 60 icin D
        >= 50 icin E
        <  50 icin F ekrana yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("ders ve notu giriniz");
        String notVeDers = scanner.nextLine();

        int bosluk = notVeDers.indexOf(" ");

        String dersAdı = notVeDers.substring(0,bosluk);
        String not = notVeDers.substring(bosluk+1);

        int notİnt = (int) Integer.parseInt(not);

        if(notİnt>=90){
            System.out.println("A");
        }else if (notİnt>=80){
            System.out.println("B");
        }else if(notİnt>=70){
            System.out.println("C");
        }else if(notİnt>=60){
            System.out.println("D");
        }else if(notİnt>=50){
            System.out.println("E");
        }else if(notİnt<50){
            System.out.println("F");
        }
    }
}
