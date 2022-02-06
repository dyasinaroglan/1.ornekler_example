package Bolum8.Classes.ExtendExample.Ornek1;

public class Main {
    /*
        Bir firmamiz var. Firmada calisan var
        calisan
            ismi
            maas            (1000)
            maasKatsayisi   (1.0, 1.5)

            maasHesapla() -> maas*maasKatsayisi

        mudur
            ismi
            maas
            maasKatsayisi   (1.0, 1.5)
            makamKatsayisi  (1.0, 1.5)
            maasHesapla() -> maas*maasKatsayisi*makamKatsayisi

       Firmada 2 calisan ve 1 müdür create edip maaslari hesaplayin,
       toString ile ekrana verilerini yazdirin.

     */
    public static void main(String[] args) {

        Calısan calısan1 = new Calısan("YASİN",3500,1.5);

        Calısan calısan2 = new Calısan("MEHMET",3250,1.24);

        Mudur mudur = new Mudur("VELİ",4500,1.2,0.8);

        System.out.println(calısan1);
        System.out.println(calısan1.maasHesapla());
        System.out.println("********************");
        System.out.println(calısan2);
        System.out.println(calısan2.maasHesapla());
        System.out.println("********************");
        System.out.println(mudur);
        System.out.println(mudur.mudurMaasHesapla());
    }
}
