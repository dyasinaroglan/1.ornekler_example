package Bolum2;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //1.) Ekrandan isminizi girin ve ilk harfin A olup olmadigini kontrol edin.
        //Eger A ise isim a ile basliyor, degilse a ile baslamiyor yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim = scanner.nextLine();

        if(isim.toUpperCase().startsWith("A"))
            System.out.println("isim A ile başlıyor");
        else
            System.out.println("isim A ile başlamıyor");

        System.out.println("**************************************");

        /*2.) Ekrandan su an ki yili ve dogum tarihinizi girin
         ve yasinizi hesaplayin. Eger yasiniz 18 den buyukse ehliyet alabilirsiniz
         degilse ehliyet alamazsiniz yazdirin.


        */
        System.out.println("doğum yılınızı girin");
        int dogumYılı = scanner.nextInt();
        System.out.println("şu an ki yılı giriniz");
        int suAnKiYıl = scanner.nextInt();

        int yas = suAnKiYıl-dogumYılı;
        System.out.println("yaşınız = "+ yas);

        if(yas>18){
            System.out.println("ehliyet alabilirsiniz");
        }else {
            System.out.println("ehliyet alamazsınız");
        }
    }

}
