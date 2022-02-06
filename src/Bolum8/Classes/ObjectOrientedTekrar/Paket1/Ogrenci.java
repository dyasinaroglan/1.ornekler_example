package Bolum8.Classes.ObjectOrientedTekrar.Paket1;

public class Ogrenci {
    static String okul = "okul adı"; //bu static bu class a aittir.
    //ama ben başka bir class da bunu ancak class ismi ile çağırabilirim.
    //class veriables dediğimizde staticler aklımıza gelecek
    //ınstance veriables lar deyince de statik olmayanlar aklımıza gelecek.
    //statik olamayanlar ram da kopya yapılıp new yapılarak oluşturulur.

    String isim;
    int numara;
    int[] notlar = new int[10];  //STATİC olmayan bunlar ise nesneye aittir.
    //diğer class da bunları nesne adını yazıp çağırabiliriz.

    /*
    STATİKLER CLASS A AİTTİR. CLASS İSMİ İLE ÇAĞIRILIR.
     */
    public static void okulIsmı(){
        System.out.println(okul); //direkt çağırıyorum
        //System.out.println(isim); ulaşamam
        //statiklerden sadece statiklere ulaşabilirim.
    }
    public void ogrencıAdı(){
        System.out.println(isim);
        System.out.println(okul);
        //burada hem okul a hem de isime ulaşabildim. staticlere her zaman ulaşırım
        //aynı class da ise
        //statiklerden statikelre ulaşılır.
        //statik olmayandan statiğe de ulaşılır.
    }
}
