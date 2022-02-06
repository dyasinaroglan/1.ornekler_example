package Bolum8.Classes.AbstractEnumInterFaceExample;

public class Banka2 extends Banka implements IFınans {
    int subeSayısı;
    double faizOranı;

    public Banka2(String isim, BankaTuru turu, double kasaToplamı, int subeSayısı, double faizOranı) {
        super(isim, turu, kasaToplamı);
        this.subeSayısı = subeSayısı;
        this.faizOranı = faizOranı;
    }

    @Override
    public void faizEkle() {

    }

    @Override
    public void paraYatır(double miktar) {
        kasaToplamı+=miktar;


    }

    @Override
    public void paraCek(double miktar) {
        if(kasaToplamı>miktar){
            kasaToplamı-= miktar;
        }

    }

    @Override
    public double kasaToplamı() {
        return kasaToplamı;
    }
}
