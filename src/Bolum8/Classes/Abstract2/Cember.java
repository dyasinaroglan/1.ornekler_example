package Bolum8.Classes.Abstract2;

public class Cember extends Sekil {

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
