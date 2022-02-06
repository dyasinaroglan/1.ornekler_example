package Bolum8.Classes.constructor2;

public class Main {
    public static void main(String[] args) {
        Otomobil oto1 = new Otomobil("MAVİ","MERCEDES",2021,3.4);
        Otomobil oto2 =new Otomobil("KIRMIZI");
        oto2.model="BMW";
        Otomobil oto3 =new Otomobil("YEŞİL","AUDI",2020);
        Otomobil oto4 = new Otomobil("TOFAŞ");
        Otomobil oto5 = new Otomobil();

        oto1.arabanınÖzellikleriYazdır();
        System.out.println("-------------------------");
        oto2.arabanınÖzellikleriYazdır();
        System.out.println("-----------------------------");
        oto3.arabanınÖzellikleriYazdır();
        System.out.println("--------------------------------");
        oto4.arabanınÖzellikleriYazdır();
        System.out.println("-----------------------------------");
        oto5.arabanınÖzellikleriYazdır();

    }
}
