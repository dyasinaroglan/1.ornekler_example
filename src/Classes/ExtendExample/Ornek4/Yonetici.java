package Classes.ExtendExample.Ornek4;

public class Yonetici extends Uye{
    String department;

    public Yonetici(String isim, int yas, String numara, String adres, int maas, String department) {
        super(isim, yas, numara, adres, maas, department);

    }

    @Override
    public String toString() {
        return "***Yonetici***" +
                "\nisim = " + isim +
                "\nyas = " + yas +
                "\nnumara = " + numara +
                "\nadres = " + adres +
                "\nmaas = " + maas +
                "\ndepartment = " + department ;
    }
}
