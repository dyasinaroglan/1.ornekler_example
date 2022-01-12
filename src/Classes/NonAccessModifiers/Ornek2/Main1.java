package Classes.NonAccessModifiers.Ornek2;

public class Main1 {
    public static void main(String[] args) {
        /*
        private 3 degisken tanimlayin
            Marka(enum), model, tip(enum), fiyat
        2 adet constructor yazin
        getter ve setter larini oluturun
        toString methodunu olusturun

        main methodu icinde bir nesne oluturun
        setterlari uygun sekilde düzenleyin
     */

        Arac1 a1 = new Arac1(Tip.SEDAN, Marka.MERCEDES,2020);
        a1.setFiyat(10000);
        System.out.println(a1);
        System.out.println("************************");
        Arac1 a2 = new Arac1(Tip.HATCHBACK,Marka.MAZDA,2021);
        a2.setFiyat(15000);
        System.out.println(a2);


    }
}
