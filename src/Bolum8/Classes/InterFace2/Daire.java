package Bolum8.Classes.InterFace2;

public class Daire extends Cember {


    public Daire(double yarıCap) {
        super(yarıCap);
    }

    @Override
    public double alanHesapla() {
        return PI*yarıCap*yarıCap;
    }
    @Override
    public String toString() {
        return "***Daire***" +
                "\nyarı çap = "+ yarıCap+
                "\nalanı = "+ alanHesapla() ;
    }
}
