package classesExample.Antreman;

public class Main1 {
    public static void main(String[] args) {
        /*
        Bir Kitap Class"i tanimlayin
        Instance vars
            adi,
            basimYili
            sayfaSayisi
        Instance Method
            kitapTanimla() ile kitabin instance vars"lari atayalim
            getKitapBilgisi() ile kitap bilgisini ekrana yazdiralim

        Class vars
            kitapSayisi
        Class method
            kitapSayisiYaz();

        Main1 class"inda da 3 kitap olusturup
        kitap bilgilerini ve kitapSayisiYaz() ile toplam kitap sayisini yazdiralim

     */

        Kitap1 ktp1 = new Kitap1("SEFİLLER",2021,567);
        Kitap1 ktp2 = new Kitap1("ÇALIKUŞU",1935,450);
        Kitap1 ktp3 = new Kitap1("MARTI", 1950,450);

        ktp1.getKitapBilgisi();
        System.out.println("---------------------------------");
        ktp2.getKitapBilgisi();
        System.out.println("-----------------------------------");
        ktp3.getKitapBilgisi();

        Kitap1.kitapSayısıYaz();



    }
}
