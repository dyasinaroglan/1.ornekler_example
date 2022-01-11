package classesExample.CalısmaUdemyATM;

import classesExample.CalısmaUdemyATM.Hesap;

public class Main {
    public static void main(String[] args) {

        Atm iş = new Atm();
        Hesap hesap = new Hesap("YASİN",2000,"264264");

        iş.calıs(hesap);

        System.out.println("programdan çıkılıyor");
    }
}
