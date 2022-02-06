package Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket2;

import Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket1.Class1;

public class Class4 {

    private int class4Private;
    int class4Default; //hiçbir şey yazmıyorsam default zaten
    protected int class4Protected;
    public int class4Public;

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.setClass1Private(4);
     // c.class1Default = 2;  //sadece aynı packagelard
    //  c.class1Protected = 3; //aynı package değil ve extend edilmezse görürüm.
        c.class1Public = 4; //public i her zaman görebiliriz.
    }
}
