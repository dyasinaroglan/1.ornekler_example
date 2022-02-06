package Bolum8.Classes.InterFace2;

public class Cember implements Sekil {

    double yarıCap;

    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*PI*yarıCap;
    }

    @Override
    public double alanHesapla() {
        throw new RuntimeException("ÇEMBERİN ALANI OLMAZ");
    }
    @Override
    public String toString() {
        return "***Cember***" +
               "\nyarı çap = "+ yarıCap+
                "\nçevresi = "+ cevreHesapla() ;
    }
}
