package Classes.ObjectOrientedTekrar.Paket3;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac();
        a1.define("mercedes",2020);

        Arac a2 = new Arac();
        a2.define("bmw",2015);

        Arac a3 = new Arac();
        a3.define("audi",2019);

        a1.aracBılgısı();
        a2.aracBılgısı();

    }
}
