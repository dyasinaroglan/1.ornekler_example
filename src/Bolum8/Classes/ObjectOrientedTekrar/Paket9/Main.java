package Bolum8.Classes.ObjectOrientedTekrar.Paket9;

public class Main {
    public static void main(String[] args) {

        Motor m = new Motor("MOTOR",2020,"beygir",5);
        TesviyeMakinesi t = new TesviyeMakinesi("TM",2015,"TESVİYE",4);
        m.calıs();
        t.calıs();

        System.out.println(Makine.getMakineSayısı());
        System.out.println(m);
        System.out.println(t);

    }
}
