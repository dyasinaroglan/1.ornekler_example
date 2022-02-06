package Bolum8.Classes.PackageStatic.pack3;

public class Book {
    int sayfaSayısı;
    private static String name;
    public int basımYılı;
    static String renk;
    public static String yayınevi;


    public static void main(String[] args) {
        Book b1 =new Book();
        b1.basımYılı = 2020; //bu zaten default.
        b1.sayfaSayısı=88; //private sadece aynı classlardan
        Book.yayınevi ="iş";
        Book.renk ="KIRMIZI";
        Book.name ="KARAMAZOV KARDEŞLER";
    }
}
