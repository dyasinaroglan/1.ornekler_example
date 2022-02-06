package Bolum8.Classes.paket2;

public class Main1 {
    /*
        Bir Kitap1 Class"i tanimlayin
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
    public static void main(String[] args) {

        Kitapp ktp1 = new Kitapp();
        ktp1.kitapTanımla("sefiller",345,1945);
        Kitapp ktp2 = new Kitapp();
        ktp2.kitapTanımla("çalıkuşu",378,1965);
        Kitapp ktp3 = new Kitapp();
        ktp3.kitapTanımla("nutuk",456,1930);

        ktp1.getKitapBilgisi();
        ktp2.getKitapBilgisi();
        ktp3.getKitapBilgisi();

        Kitapp.kitapSayısıYaz();
    }
}
