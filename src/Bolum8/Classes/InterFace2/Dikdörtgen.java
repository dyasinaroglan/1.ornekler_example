package Bolum8.Classes.InterFace2;

public class Dikdörtgen implements Sekil {
    double uzunluk,genislik;

    public Dikdörtgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public Dikdörtgen(double uzunluk) {
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunluk+genislik);
    }

    @Override
    public double alanHesapla() {
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return "***Dikdörtgen***" +
                "\nuzunluk = " + uzunluk +
                " \ngenislk = " + genislik+
                "\nalanı = "+ alanHesapla()+
                "\nçevresi = "+ cevreHesapla() ;
    }
}
