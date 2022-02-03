package Classes.ObjectOrientedTekrar.Paket2;

import Classes.Inheritance5.A;

public class Main {
    public static void main(String[] args) {
        Arac bmw = new Arac();
        bmw.marka ="BMW";
        bmw.model = 2021;
        Arac.aracSayısı++;

        Arac m = new Arac();
        m.marka = "mercedes";
        m.model = 2010;
        Arac.aracSayısı++;
        bmw.aracBılgısı();
        m.aracBılgısı();
        System.out.println(Arac.aracSayısı);


    }
}
