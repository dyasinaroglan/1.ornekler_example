package Bolum2;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        /*
        kullanicidan yan yana aralarinda bir bosluk olacak
        sekilde 2 tamsayi isteyin. bu sayilarin tek mi cift mi oldugunu kontrol edin.


*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("aralarında boşluk olacak şekilde 2 tam sayı giriniz");
        String sayılar = scanner.nextLine();

        int bosluk = sayılar.indexOf(" ");
        String sayı1 = sayılar.substring(0,bosluk);
        String sayı2 = sayılar.substring(bosluk+1);

        int intSayı1 = (int) Integer.parseInt(sayı1);
        int intSayı2 = (int) Integer.parseInt(sayı2);

        if(intSayı1==0){
            System.out.println("sayı1 çifttir.");
        }else {
            System.out.println("sayı1 tektir.");
        }
        if (intSayı2==1){
            System.out.println("sayı2 tektir");
        }else {
            System.out.println("sayı2 çifttir.");
        }
    }
}
