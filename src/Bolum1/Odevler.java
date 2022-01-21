package Bolum1;

public class Odevler {
    public static void main(String[] args) {
        /*
        myStr isminde bir String tanımlayın ve initialize (ilk metni atayın) edin.
        1) myStr'nin uzunluğunu bulun.
        2) Baştaki, Sondaki ve Ortadaki karakterini bulup konsola yazdırın ve bu
        karakteri ve index'lerini farklı değişkenler tanımlayıp ilgili değişkenlere assign
        edin (atayın). (Örnek: int indexFirst; String charFirst; ...)
        3) Bulduğunuz bu karakterleri concat methodu kullanarak birlestirin ve konsola yazdırın.

        4) Bulduğunuz bu karakterlerin index'lerinin toplamını konsola yazdırın.
        5) İşlemlerinizi yaparken el ile girilecek sabit olan sadece myStr'in textı olmalı.
        myStr değişkeninin metni değiştiğinde programınız hatasız çalışabilmeli.
         */

        String myStr = "galatasaray";
        int uzunluk = myStr.length();
        System.out.println(uzunluk);
       char ilkHarf = myStr.charAt(0);
       char sonHarf = myStr.charAt(myStr.length()-1);
        System.out.println("******************");
       int index = myStr.indexOf(sonHarf);
        System.out.println(index);
        System.out.println("******************");
       char ortaHarf = myStr.charAt(myStr.length()/2);
        System.out.println(ilkHarf +","+ ortaHarf+","+ sonHarf);
    }
}
