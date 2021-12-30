package Methods;

import java.util.Scanner;

public class Calısma9 {
    public static void main(String[] args) {
         /*
        Kullanicidan 5 tane meyve girmesini isteyin.
        Bu meyvelerden kac tanesinde e harfi oldugunu bulan bir metot yazin.
         */

        Scanner scanner = new Scanner(System.in);
        String[] meyve = new String[5];
        for (int i = 0; i < meyve.length; i++) {
            System.out.println("meyve giriniz");
            meyve[i] = scanner.nextLine();


        }
        kacEVar(meyve);
        System.out.println("kaç E var:"+kacEVar(meyve));

    }

    public static int kacEVar(String[] meyve) {
        int miktar = 0;

        for (int i = 0; i < meyve.length; i++) {
            if (meyve[i].contains("e")) {
                miktar++;
            }
        }
        return miktar;
    }
}


