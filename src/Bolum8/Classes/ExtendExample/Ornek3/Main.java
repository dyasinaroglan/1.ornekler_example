package Bolum8.Classes.ExtendExample.Ornek3;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new  BMW();
        bmw.start();
        bmw.theftSafety();
        bmw.refuel();
        bmw.stop();

        Car c1 = new Car();
        c1.engine();
        c1.start();
        c1.stop();


        Car c2 = new BMW();//alt sınıf nesnesi, ana sınıf referans nesnesi tarafından sevk edilebilir.
        c2.refuel();
        c2.engine();
        c2.start();
        c2.stop();




    }
}
