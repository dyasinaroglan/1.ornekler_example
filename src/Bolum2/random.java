package Bolum2;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        /*
        Kullanicidan aralarinda virgül olacak sekilde iki tam sayi alin.
         Bu tamsayilardan büyük olani ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayıları giriniz");
        String sayılar = scanner.nextLine();

        int virgül = sayılar.indexOf(",");
        String sayı1 = sayılar.substring(0,virgül);
        String sayı2 = sayılar.substring(virgül+1);

        int sayı1İnt = (int) Integer.parseInt(sayı1);
        int sayı2İnt = (int) Integer.parseInt(sayı2);

        if(sayı1İnt>sayı2İnt){
            System.out.println("büyük olan sayı = "+ sayı1İnt);
        }else if (sayı1İnt<sayı2İnt){
            System.out.println("büyük olan sayı = "+ sayı2İnt);
        }else {
            System.out.println("EŞİTTİR");
        }

    }
}
