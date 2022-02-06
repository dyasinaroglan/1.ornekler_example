package Bolum8.Classes.Extends.extend2;

public class Futbol extends Kulüp {
    boolean ofsayt;


    public void oyna(){
        System.out.println("hadi oynayalım!");
    }

    @Override
    public String toString() {
        return
                "ofsayt = " + ofsayt +
                "\nisim = " + isim +
                "\nkurulusYılı = " + kurulusYılı +
                "\nülkesi = " + ülkesi ;
    }

    public void golAt(){
        System.out.println("gool attım!");



    }
}
