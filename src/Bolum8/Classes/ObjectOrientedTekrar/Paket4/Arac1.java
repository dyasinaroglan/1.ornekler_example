package Bolum8.Classes.ObjectOrientedTekrar.Paket4;

public class Arac1 {
    String marka;
    int model;
    int buAracSayısı;  //bunlara değer atamazsak da 0 ve null değerlerini alır.
    //ama methot içerisinde değişkenleri initiliaze etmek zorundayım.
    static int aracSayısı;

    //class ismi ile aynı ancak return u olmayan method constructur dır.
    public Arac1(String marka, int model) {
        this(marka);
        if (model<2000){
            this.model = 2000;
        }else {
            this.model = model;
        }
        aracSayısı++;
        buAracSayısı++;
        //bir veya birden fazla constructor kullanabilirim
    }

    public Arac1(String marka) { //tek olarak da constructor yapabilirim.
        this.marka = marka;
    }

    public void aracBılgısı(){
        System.out.println(marka+ "," + model+ " araç sayısı : "+ aracSayısı);
    }

    public static void main(String[] args) {
        Arac1 a1 = new Arac1("BMW",2020);
        Arac1 a2 = new Arac1("MERCEDES",2015);

        a1.aracBılgısı();
        a2.aracBılgısı();
    }
}
