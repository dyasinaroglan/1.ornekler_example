package Bolum8.Classes.ObjectOrientedTekrar.Paket8;

public class Class1 extends Parent {

    int genislik;

    public Class1(){

    }

    public Class1(int yas, String isim, int genislik) {
        super(yas, isim); //super her zaman ilk başta-ilk satırda olmak zorundadır.
        this.genislik = genislik;
        super.yas = 10; //super ile ulaşırım Parents
    }



    public int getGenislik(){
        return genislik;
    }

}

//iki clas da da ortak methodlar ve veriables lar var.
