package Bolum8.Classes.AbstractEnumInterFaceExample;

public abstract class Banka  {
    String isim;
    BankaTuru turu;
    double kasaToplamı;

    public Banka(String isim, BankaTuru turu, double kasaToplamı) {
        this.isim = isim;
        this.turu = turu;
        this.kasaToplamı = kasaToplamı;
    }

    public abstract void faizEkle();


}
