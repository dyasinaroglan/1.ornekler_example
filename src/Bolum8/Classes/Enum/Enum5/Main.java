package Bolum8.Classes.Enum.Enum5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Kulüp kulüp = Kulüp.GALATASARAY;
        Kulüp kulüp1 = Kulüp.BARCELONA;
        Kulüp kulüp3 = Kulüp.CHELSEA;

        ArrayList<Kulüp> takımlar = new ArrayList<>(Arrays.asList(Kulüp.GALATASARAY,Kulüp.CHELSEA,Kulüp.BARCELONA));

        for (Kulüp kulüpler : takımlar) {
            System.out.println(kulüpler);

        }
        System.out.println(Kulüp.GALATASARAY.toString());
        System.out.println("*************************");
        System.out.println(kulüp.getIsim());
        System.out.println("**************************");
        System.out.println(kulüp1.getIsim());
        System.out.println("**************************");
        System.out.println(kulüp3.getIsim());


    }
}
