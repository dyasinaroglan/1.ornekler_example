package classesExample.Antreman1;

public class Main2 {
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
                void tanimla(int x, int y);
                void tanimla(Boyut boyut);
                double getCevre();
                double getAlan();

             Main2
                Dikdörtgen tanimlanip alani ve cevresi hesaplanacak


         */
        Dikdörtgen d1 = new Dikdörtgen();
        d1.tanımla(4,5);
        System.out.println(d1.alan());
        System.out.println(d1.cevre());


    }
}
