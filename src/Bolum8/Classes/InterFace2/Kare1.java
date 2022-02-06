package Bolum8.Classes.InterFace2;

public class Kare1 implements Sekil {

    //istediğim kadar implement edebilirim. ama bir defa extend etme hakkım var.

    double uzunluk;

    public Kare1(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public double cevreHesapla() {
        return 4*uzunluk;

    }

    @Override
    public double alanHesapla() {
        return uzunluk*uzunluk;
    }
}
