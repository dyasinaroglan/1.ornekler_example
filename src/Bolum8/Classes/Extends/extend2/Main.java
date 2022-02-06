package Bolum8.Classes.Extends.extend2;

public class Main {
    public static void main(String[] args) {

        Kulüp kulüp = new Kulüp();

        Futbol futbol = new Futbol();

        futbol.ülkesi ="ispanya";
        futbol.isim ="barcelona";
        futbol.golAt();
        futbol.ofsayt = true;
        futbol.kurulusYılı = 1898;
        System.out.println(futbol);

        Basketbol basketbol = new Basketbol();
        basketbol.isim = "CSKA MOSKOVA";

        Voleybol voleybol = new Voleybol();
        voleybol.ülkesi ="almanya";

    }
}
