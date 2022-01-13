package Classes.Enum.Enum4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = Kitap.KITAP1;
        Kitap kitap2 = Kitap.KITAP2;
        Kitap kitap3 = Kitap.KITAP3;

      /* System.out.println(kitap1.toString());
        System.out.println("*********************");
        System.out.println(kitap2.toString());

       */

        //şunu da yapabilirim. Kitap türünden bir arrayList oluşturabilirim.

        ArrayList<Kitap> kitaplar = new ArrayList<>(Arrays.asList(Kitap.KITAP1,Kitap.KITAP2,Kitap.KITAP3));

        for (Kitap kitap : kitaplar) {
            System.out.println(kitap);

        }
        kitaplar.forEach(k-> System.out.println(k));
        System.out.println("*******************************");
        kitaplar.forEach(System.out::println);

    }

}
