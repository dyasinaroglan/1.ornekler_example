package Bolum8.Classes.ObjectOrientedTekrar.Paket7;

public class Parent {
    int yas;
    String isim;

    public Parent(int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }

    public void yaz(){
        System.out.println(isim + "," + yas);
    }
}
