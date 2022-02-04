package Classes.ObjectOrientedTekrar.Paket5;

public class Main {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("ALİ",34);
        Ogrenci o2= new Ogrenci("HASAN",324);
        Ogrenci o3 = new Ogrenci("HÜSEYİN",264);
        Ogrenci o4 = new Ogrenci("VELİ",5);


        o1.arkadasAta(o2);
        o2.arkadasAta(o3);
        System.out.println(o1);


    }
}
