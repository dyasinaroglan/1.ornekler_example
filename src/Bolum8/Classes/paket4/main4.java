package Bolum8.Classes.paket4;

public class main4 {
    public static void main(String[] args) {
        /*
            Bir dikdörtgenin alanini hesaplayalim

             Boyut class
                double x;
                double y;

            Dikdörtgen class
                //ins var
                Boyut boyut;

                //methods
                void tanimla(double x, double y);
                void tanimla(Boyut boyut);
                double getCevre();
                double getAlan();

             Main2
                Dikdörtgen tanimlanip alani ve cevresi hesaplanacak


         */

        Dikdörtgen d1 = new Dikdörtgen();
        d1.tanımla(2,3);
        System.out.println("alan:" +d1.getAlan());
        System.out.println("çevre:" +d1.getCevre());

    }
}
