package Classes.paket3;

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
                void tanimla(double x, double y);
                void tanimla(Boyut boyut);
                double getCevre();
                double getAlan();

             Main2
                Dikdörtgen tanimlanip alani ve cevresi hesaplanacak


         */
        Dikdörtgen d1 = new Dikdörtgen();
        d1.tanımla(2,3);
        //d1.getCevre(); dersek sadece yazdırmaz. çünkü methodun içerisinde biz sadece return ettik. yazdırmadık.

        System.out.println("alanı:"+d1.getAlan());
        System.out.println("çevresi:"+d1.getCevre());

    }
}
