package Ternary;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
        //sayı tek mi çift mi
        Scanner scanner = new Scanner(System.in);
        System.out.println("tam sayı girin");
        int num = scanner.nextInt();
       /* String sonuc;
        if (num % 2 == 0) {
            sonuc = "çifttir";
        } else {
            sonuc = "tektir";
            System.out.println(sonuc);

        */
        System.out.println(tekMiCiftMi(num));

    }

    public static String tekMiCiftMi(int num) {
        String sonuc = "";
        sonuc = (num % 2 == 0) ? "tek" : "çift";  //sonuc stringi neye eşit olsun
        //(num % 2 == 0) sonucu true ise tek çift ise çift olsun anlamına gelir
        return sonuc;
     /*  if (num % 2 == 0) {
            sonuc = "çifttir";
        } else {
            sonuc = "tektir";
        }
        return sonuc;
    }

      */ //bu işlemi ternary operator ile nasıl yaparım
    }

}
