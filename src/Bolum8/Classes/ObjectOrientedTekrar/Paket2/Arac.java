package Bolum8.Classes.ObjectOrientedTekrar.Paket2;

public class Arac {
    String marka;
    int model;
    int buAracSayısı;  //bunlara değer atamazsak da 0 ve null değerlerini alır.
    //ama methot içerisinde değişkenleri initiliaze etmek zorundayım.
    static int aracSayısı;

    public void aracBılgısı(){
        System.out.println(marka+ "," + model+ " araç sayısı : "+ aracSayısı);

    }
}
