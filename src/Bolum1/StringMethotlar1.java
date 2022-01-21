package Bolum1;

public class StringMethotlar1 {
    public static void main(String[] args) {

        String str = "Şampiyon Galatasaray23";
        String str2 = "";

        System.out.println(str.startsWith("ş")); //İlk harfi kontrol eder. büyük harf küçük harf duyarlıdır.
        System.out.println(str.startsWith("Ş"));

        System.out.println(str.endsWith("3")); //son farfe bakar.

        String replace = str.replace("a","6");
        System.out.println(replace);

        String firstReplace = str.replaceFirst("a","6");
        System.out.println(firstReplace); //burada sadece ilk gördüğü char ı değiştirir.

        String strReplaceAll = str.replaceAll("[a-z]","*"); // a dan z ye tüm küçük harfleri * yap.
        System.out.println(strReplaceAll);

        String strReplaceAll2 = str.replaceAll("[^a-z]","*"); // a dan z ye kadar olmayan harfleri * yap
        System.out.println(strReplaceAll2);



    }
}
