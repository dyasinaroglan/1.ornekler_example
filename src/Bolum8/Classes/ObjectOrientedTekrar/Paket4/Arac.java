package Bolum8.Classes.ObjectOrientedTekrar.Paket4;

public class Arac {
    String marka;
    int model;
    int buAracSayısı;  //bunlara değer atamazsak da 0 ve null değerlerini alır.
    //ama methot içerisinde değişkenleri initiliaze etmek zorundayım.
    static int aracSayısı;

    //class ismi ile aynı ancak return u olmayan method constructur dır.
    public Arac(String marka, int model) {
        this.marka = marka;
        this.model = model;
        aracSayısı++;
        buAracSayısı++;
        //bir veya birden fazla constructor kullanabilirim
    }

    public void aracBılgısı(){
        System.out.println(marka+ "," + model+ " araç sayısı : "+ aracSayısı);
    }

    public static void main(String[] args) {
        Arac a1 = new Arac("BMW",2020);
        Arac a2 = new Arac("MERCEDES",2015);

        a1.aracBılgısı();
        a2.aracBılgısı();
    }
}
