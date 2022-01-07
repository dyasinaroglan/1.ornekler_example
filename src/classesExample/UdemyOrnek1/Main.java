package classesExample.UdemyOrnek1;

public class Main {
    public static void main(String[] args) {
        /*Soru 3
        Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için
        metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
        Bölme işlemi için 0 değerini için gerekli kontrolü yazın.

         */
        Islem i1 = new Islem();

        System.out.println("toplam=" +i1.topla(4,5,12,56,45,4));
        System.out.println(i1.böl(32,4));

        System.out.println("çıkarma sonucu="+i1.cıkar(45,34,2,5,34));
        System.out.println("çarpma işlemi sonucu="+i1.carp(3,4,7));
        System.out.printf("bölme işlemi= %.2f",i1.böl(45,5,4));
        System.out.println();
        System.out.printf("bölme işlemi sonucu = %.2f",i1.böl(0,12,6));
    }
}
