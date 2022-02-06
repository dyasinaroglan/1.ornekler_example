package Bolum8.Classes.AbstractEnumInterFaceExample;

public class Banka1 extends Banka implements IFınans {

    String adres;
    double faizOranı;

    public Banka1(String isim, BankaTuru turu, double kasaToplamı, String adres, double faizOranı) {
        super(isim, turu, kasaToplamı);
        this.adres = adres;
        this.faizOranı = faizOranı;
    }

    @Override
    public void faizEkle() {
        kasaToplamı *= (1+faizOranı);

    }

    @Override
    public void paraYatır(double miktar) {
        kasaToplamı+=miktar;

    }

    @Override
    public void paraCek(double miktar) {

    }

    @Override
    public double kasaToplamı() {
        return kasaToplamı;
    }
}
