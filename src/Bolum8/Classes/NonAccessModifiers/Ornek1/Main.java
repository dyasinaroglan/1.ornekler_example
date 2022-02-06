package Bolum8.Classes.NonAccessModifiers.Ornek1;

public class Main {
    /*
        private 3 degisken tanimlayin
            Marka, model, fiyat
        2 adet constructor yazin
        getter ve setter larini oluturun
        toString methodunu olusturun

        main methodu icinde bir nesne oluturun
        setterlari uygun sekilde düzenleyin
     */

    public static void main(String[] args) {
        Arac a1 = new Arac("MERCEDES",2005);
        System.out.println(a1.getModel());
       // a1.setModel(2011);
        //System.out.println(a1);
        a1.setFiyat(5000);
        System.out.println(a1.getFiyat());


    }
}
