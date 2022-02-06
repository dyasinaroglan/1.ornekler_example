package Bolum8.Classes.PackageStatic.pack1;

public class Banka1 {
    String sube;  //DEFAULT
    public String sehir; //PUBLİC

    static int count;
    public static String ulke;
    private static int num;

    //burada main methodu açarsak ancak private static int num a ulaşabiliriz.
    public static void main(String[] args) {
        Banka1 b1 = new Banka1();
        Banka1.num =5;
    }
}
