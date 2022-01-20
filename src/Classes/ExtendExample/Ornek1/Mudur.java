package Classes.ExtendExample.Ornek1;

public class Mudur extends Calısan {

    double makamKatSayısı;

    public Mudur(String ismi, int maas, double maasKatSayısı, double makamKatSayısı) {
        super(ismi, maas, maasKatSayısı);
        this.makamKatSayısı = makamKatSayısı;
    }
    public double mudurMaasHesapla(){
        return maas*maasKatSayısı*makamKatSayısı;
    }

    @Override
    public String toString() {
        return "***Mudur***" +
                "\nismi = " + ismi +
                "\nmaas = " + maas +
                "\nmaasKatSayısı = " + maasKatSayısı +
                "\nmakamKatSayısı = " + makamKatSayısı ;
    }
}
