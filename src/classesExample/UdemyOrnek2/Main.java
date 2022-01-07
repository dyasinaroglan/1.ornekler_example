package classesExample.UdemyOrnek2;

public class Main {
    public static void main(String[] args) {

       /* Soru 4
        Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu
        tutan hesapNo, hesaptakiPara, para yatirma ve çekme metotları olsun.
                Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam
        paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para
        değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.

        */

        Banka hesap1 = new Banka(1,1000);
        Banka hesap2 = new Banka(2,1500);
        Banka hesap3 = new Banka(3,1250);
        System.out.println(hesap1.getKasaBakiyesi());
        System.out.println(hesap2.getKasaBakiyesi());
        System.out.println("--------------------------");
        System.out.println(hesap1.paraYatır(200));
        System.out.println(hesap2.paraCek(300));
        System.out.println("---------------------------");
        System.out.println(hesap1.paraCek(500));
        System.out.println(hesap2.getKasaBakiyesi());
        System.out.println(hesap2.paraCek(600));
        System.out.println(hesap1.getKasaBakiyesi());
        System.out.println(hesap2.getKasaBakiyesi());

        Banka.bankaÖzet();  //static method olduğu için direkt class ın methodu. yani Banka.bankaOzet yazarak istediğimizi alabiliriz.



    }

}
