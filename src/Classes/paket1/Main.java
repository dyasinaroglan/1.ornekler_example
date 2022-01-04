package Classes.paket1;

public class Main {
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

        Main lass"inda da 3 kitap olusturup
        kitap bilgilerini ve kitapSayisiYaz() ile toplam kitap sayisini yazdiralim

     */
        Kitap kitap1 = new Kitap();
        kitap1.kitapTanımla("sefiller",1955,550);


        Kitap kitap2 = new Kitap();
        kitap2.kitapTanımla("çalıkuşu",1940,450);

        Kitap kitap3 = new Kitap();
        kitap3.kitapTanımla("nutuk",1930,500);
        //kitapları metot yaparak tanımaldık ve içini doldurduk.
        //şimdi kitapları yazdıralım.

        kitap1.getKitapBilgisi();
        System.out.println("-------------------------------");
        kitap2.getKitapBilgisi();
        System.out.println("--------------------------------");
        kitap3.getKitapBilgisi();

        Kitap.kitapSayısıYaz(); //static olan method CLASS ismi ile çağrılır.
        //statik-->hareketi olmayan





    }
}
