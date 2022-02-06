package Bolum8.Classes.Extends.extend6;

public class Bilgisayar extends Telefon {

    static {
        System.out.println("bilgisayarın static initilizeri");
    }

    public Bilgisayar() {
        System.out.println("BİLGİSAYARIN constructor u");
    }

    {
        System.out.println("BİLGİSAYARIN instance initiliazeri");
    }
}
