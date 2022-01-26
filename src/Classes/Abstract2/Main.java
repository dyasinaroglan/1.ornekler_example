package Classes.Abstract2;


public class Main {
    public static void main(String[] args) {
        /*
    Sekil--> abstract class
    (alan hesapla ve cevre hesapla methotları olsun.)

    Dikdörtgen -->extends (Sekil)
    Kare  ---> extends (Dikdörtgen)
    Kare1 ---> implements  (ISekil)
    Cember  ---> extends (Sekil)
    Daire   ---> extends (cember)

     */

            Sekil kare = new Kare(5);
            Sekil cember = new Cember(4);
            Sekil daire = new Daire(3);
            Dikdörtgen dikdörtgen = new Dikdörtgen(3,4);


            System.out.println(kare);
            System.out.println(cember);
            System.out.println(daire);
            System.out.println(dikdörtgen);



        }

    }

