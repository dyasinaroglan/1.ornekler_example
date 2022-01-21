package Bolum1;

import java.util.Scanner;

public class ScOrnekler {

    public static void main(String[] args) {
       /* 1.) ekrandan 2 kelimelik bir yazi yazin.
       ekrandan girdiginiz bu iki kelimenin
       yerlerini degistirip ekrana yazdirin
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 kelime yazınız");
        String kelime = scanner.nextLine();

        int bosluk = kelime.indexOf(" ");
        String ilkKelime = kelime.substring(0,bosluk);
        String sonKelime = kelime.substring(bosluk+1);

        System.out.println(sonKelime + " "+ ilkKelime);

        //4.) Su an ki yili ve dogum tarihinizi ekrandan
        // alip yasinizi hesaplayin.

        System.out.println("şu an ki yılı giriniz");
        int suAnKiYıl = scanner.nextInt();
        System.out.println("doğum tarihinizi girin");
        int dogumYılı = scanner.nextInt();

        int yas = suAnKiYıl-dogumYılı;
        System.out.println("yaş = "+ yas);


    }
}
