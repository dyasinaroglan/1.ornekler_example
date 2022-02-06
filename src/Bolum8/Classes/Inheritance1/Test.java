package Bolum8.Classes.Inheritance1;

public class Test {
    public static void main(String[] args) {

        Yonetici yonetici1 = new Yonetici("YASİN",5500,"İT",5);
        Calısan calısan1 = new Yonetici("MUSTAFA",4587,"İK",5);

        yonetici1.calıs();
        yonetici1.bilgileriGöster();
        yonetici1.getIsim();
        System.out.println("*********");
        calısan1.bilgileriGöster();
        calısan1.zamYap(500);

        System.out.println("**************");
        yonetici1.bilgileriGöster();
    }
}
