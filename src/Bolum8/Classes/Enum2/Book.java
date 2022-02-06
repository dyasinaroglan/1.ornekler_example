package Bolum8.Classes.Enum2;

public enum Book {
    //SEFİLLER Book class ından oluşturulmuş public static final class tır.
    SEFILLER ("SEFİLLER",345),
    SİNEKLİBAKKAL("SİNEKLİ BAKKAL", 250),
    ;

    private String isim;
    private int sayfaSayısı;

    Book(String isim, int sayfaSayısı) {
        this.isim = isim;
        this.sayfaSayısı = sayfaSayısı;
    }
    public void kitapBılgısı(){
        System.out.println(isim + "," + sayfaSayısı );
    }
}
