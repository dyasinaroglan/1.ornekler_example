package Classes.ExtendExample.Ornek4;

public class Uye {

    String isim;
    int yas;
    String numara;
    String adres;
    int maas;
    String department;

    public void maasYazdır(){
        System.out.println("MAAŞ = "+ maas);
    }

    public Uye(String isim, int yas, String numara, String adres, int maas, String department) {
        this.isim = isim;
        this.yas = yas;
        this.numara = numara;
        this.adres = adres;
        this.maas = maas;
        this.department = department;
    }
}
