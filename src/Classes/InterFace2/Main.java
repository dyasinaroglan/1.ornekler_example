package Classes.InterFace2;

public class Main {
    /*
    ISekil--> InterFace
    (alan hesapla ve cevre hesapla methotları olsun.)

    Dikdörtgen -->implements (ISekil)
    Kare  ---> extends (Dikdörtgen)
    Kare1 ---> implements  (ISekil)
    Cember  ---> ımplements (ISekil)
    Daire   ---> extends ( cember)

     */
    public static void main(String[] args) {
        Sekil dikdörtgen = new Dikdörtgen(3,4);
        Sekil kare = new Kare(5);
        Sekil cember = new Cember(4);
        Sekil daire = new Daire(3);

        System.out.println(dikdörtgen);
        System.out.println(kare);
        System.out.println(cember);
        System.out.println(daire);



    }
}
