package Classes.PackageStatic.pack2;

import Classes.PackageStatic.pack1.Banka1;

public class Main2 {
    public static void main(String[] args) {
        Banka1 b1 = new Banka1();
        b1.sehir="ANKARA";
        //FARKLI package lerde ise sadece public e ulaşabilirim.
        //default methoda ulaşamam.
        //banka1.count ulaşamam default
        Banka1.ulke="FRANSA";
    }


}
