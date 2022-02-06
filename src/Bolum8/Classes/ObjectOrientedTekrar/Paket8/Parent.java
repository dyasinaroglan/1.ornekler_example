package Bolum8.Classes.ObjectOrientedTekrar.Paket8;

public class Parent {
    int yas;
    String isim;

    public Parent(){

    }

    public Parent(int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }

    public void yaz(){
        System.out.println(isim + "," + yas);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                '}';
    }
}
