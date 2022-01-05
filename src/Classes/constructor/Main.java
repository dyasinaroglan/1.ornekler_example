package Classes.constructor;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("rukiye","ayyıldız",45,true,9);
        Ogrenci ogr2 = new Ogrenci(24,"yasin",true);
        Ogrenci ogr3 = new Ogrenci(); //hiç bir şey doldurmadım
        ogr3.yazdır();
        System.out.println("----------------------------");
        ogr1.yazdır();
        System.out.println("-----------------------------");
        ogr2.yazdır();
    }
}
