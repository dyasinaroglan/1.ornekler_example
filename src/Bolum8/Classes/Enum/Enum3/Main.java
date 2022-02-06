package Bolum8.Classes.Enum.Enum3;

public class Main {
    public static void main(String[] args) {

        Otomobil otomobil1 = Otomobil.BMW;
        System.out.println(otomobil1.getÜretildiğiÜlke());
        System.out.println(otomobil1.name());
        System.out.println(otomobil1.ordinal());
        System.out.println(otomobil1.toString());

        Otomobil otomobil2 = Otomobil.TOYOTA;
        System.out.println(otomobil2.getÜretildiğiÜlke());
        System.out.println(otomobil2.toString());


    }
}
