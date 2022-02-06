package Bolum8.Classes.Extends.extend3;

public class Main {
    /*
        Arac (fields: turu enum, model)
            String turu = "Kamyon;
            Turu turu = Turu.Kamyon;

            Kamyon (fields: yukKapasitesi)      (class)
            Otomobil (fields: marka)            (class) (fields: turu enum, model, marka)
            Otobus (fields: yolcuKapasitesi)    (class)

       Kamyon, Otomobil, Otobus -> extends Arac

        Arac"in constructor ekleyin


     */
    public static void main(String[] args) {

        Otomobil otomobil = new Otomobil(Turu.Otomobil,2020,"MERCEDES");
        Otobüs otobüs = new Otobüs(Turu.Otobüs,1999,40);
        Kamyon kamyon = new Kamyon(Turu.Kamyon,2020,3);

    }


}
