package Classes.ObjectOrientedTekrar.Paket6;

public class Main {
    public static void main(String[] args) {
        /*
        bir Arac nesnesi
        isim
        yolcuKapasitesi
        yolcular

        insan nesnesi oluşturun.

        Araca insan binip insin.

         */

        Arac dolmus = new Arac("DOLMUS",3);

        Insan yolcu1 = new Insan("A");
        Insan yolcu2 = new Insan("B");
        Insan yolcu3 = new Insan("C");
        Insan yolcu4 = new Insan("D");
        Insan yolcu5 = new Insan("E");

        dolmus.yolcuAl(yolcu1);
        dolmus.yolcuAl(yolcu2);
        yolcu3.aracBın(dolmus); //Arac class ından çağırma şekli
        dolmus.yolcuAl(yolcu4);
        dolmus.yolcuListesi();
        dolmus.yolcuIndır(yolcu5);
        dolmus.yolcuIndır(yolcu3);
        dolmus.yolcuListesi();



    }
}
