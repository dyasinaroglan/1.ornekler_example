package Bolum1;

import java.util.Locale;

public class StringMethotlar2 {
    public static void main(String[] args) {
        String str = "Şampiyon GALATASARAY";

        String strtolowerCse = str.toLowerCase(Locale.ROOT);

        System.out.println(strtolowerCse); //büyük harfleri küçük harfe dönüştürür.

        String strToUpperCase = str.toUpperCase(Locale.ROOT);
        System.out.println(strToUpperCase); //küçük harfleri büyük harfe dönüştürür.

        String str1 ="şampiyon galatasaray";

        System.out.println(str.equals(str1)); //string ifadenin aynı mı değil misine bakar. büyük harf küçük harf duyarlıdır.

        System.out.println(str1.contains("şampiyon"));
        System.out.println(str1.contains("Galatasaray")); //büyük harf küçük harf duyarlı.
        //string ifadenin içinde o string ifadenin olup olmadığına bakar.

    }
}
