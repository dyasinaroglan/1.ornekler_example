package Classes.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Otomobil oto1 = new Otomobil("MAVİ","FORD",2020);
        //oto1. yazdığımda renk,motor hacmi vs çıkmaz. private den dolayı.

        System.out.println(oto1.setMotorHacmi(3.4));

        System.out.println(oto1.getModel("FİAT"));
        System.out.println(oto1.getYıl(1999));




    }
}
