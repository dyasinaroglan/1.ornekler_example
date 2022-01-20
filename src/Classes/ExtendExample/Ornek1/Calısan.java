package Classes.ExtendExample.Ornek1;

public class Calısan {

    String ismi;
    int maas;
    double maasKatSayısı;

    public Calısan(String ismi, int maas, double maasKatSayısı) {
        this.ismi = ismi;
        this.maas = maas;
        try {
            if(maasKatSayısı<1)
                throw new RuntimeException("MAAŞ KATSAYISI 1'DEN KÜÇÜK OLAMAZ");
                this.maasKatSayısı = maasKatSayısı;
        }catch (RuntimeException e){
            this.maasKatSayısı=1;
        }

    }
    public double maasHesapla(){
        return  maas*maasKatSayısı;
    }

    @Override
    public String toString() {
        return "***Calısan***" +
                "\nismi = " + ismi +
                "\nmaas = " + maas +
                "\nmaasKatSayısı = " + maasKatSayısı ;
    }
}
