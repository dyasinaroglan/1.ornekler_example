package Classes.ExtendExample.Ornek4;

public class Calısan extends Uye{

    String uzmanlık;


    public Calısan(String isim, int yas, String numara, String adres, int maas, String department, String uzmanlık) {
        super(isim, yas, numara, adres, maas, department);
        this.uzmanlık = uzmanlık;
    }

    @Override
    public String toString() {
        return "***Calısan***" +
                "\nuzmanlık = " + uzmanlık +
                "\nisim = " + isim +
                "\nyas = " + yas +
                "\numara = " + numara +
                "\nadres = " + adres +
                "\nmaas = " + maas +
                "\ndepartment = " + department ;
    }
}
