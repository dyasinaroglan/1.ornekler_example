package Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket2;

import Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket1.Class1;

public class Class3 extends Class1 {

    private int class3Private;
    int class3Default; //hiçbir şey yazmıyorsam default zaten
    protected int class3Protected;
    public int class3Public;

    public static void main(String[] args) {
        Class3 c = new Class3();
        c.setClass1Private(5);
     // c.class1Default = 2;  //bunu göremedim çünkü aynı package de ancak görebilir.
        c.class1Protected = 3; //görülmedi çünkü aynı package ve extend edilseydi görülürdü. EXTEND ETTĞİMİZDE GÖRÜCEKTİR
        c.class1Public = 4;
    }
}
