package Bolum8.Classes.ObjectOrientedTekrar.Paket4;

import java.util.ArrayList;

public class Arac2 {
    String marka;
    int model;
    int[] arr = new int[3];
    int buAracSayısı;  //bunlara değer atamazsak da 0 ve null değerlerini alır.
    //ama methot içerisinde değişkenleri initiliaze etmek zorundayım.
    static int aracSayısı;
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Arac> list1 = new ArrayList<>();
    Arac a ;
    Arac1 b;
    Arac2 c;

    //class ismi ile aynı ancak return u olmayan method constructur dır.
    public Arac2(String marka, int model) {
        this.marka = marka;
        if (model<2000){
            this.model = 2000;
        }else {
            this.model = model;
        }
    }

}
