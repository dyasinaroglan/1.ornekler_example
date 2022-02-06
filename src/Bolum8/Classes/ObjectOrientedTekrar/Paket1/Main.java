package Bolum8.Classes.ObjectOrientedTekrar.Paket1;

public class Main {

    public static void main(String[] args) {

        //static method static methoda ulaşır. static methoda class ismi ile ulaşırım.
        //statik tanımlılar classs a aittir ve bir tanedir

        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci();
        o1.isim = "ALİ";
        o2.isim = "VELİ";
        o1.ogrencıAdı();
        o2.ogrencıAdı();
        Ogrenci.okulIsmı();


        Ogrenci.okul = "SDDS";
        Ogrenci.okulIsmı(); //CLASS ismi ile statik methodunu çağırdım
    }
    //class ın methodudur.
    public static void yaz(){
        System.out.println("java");
    }
    //nesnenin methodudur
    public void yaz1(){
        System.out.println("dünya");
    }
}
