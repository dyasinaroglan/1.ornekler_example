package Classes.InterFace;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sekil sekil = new Sekil();
        Sekil1 sekil1 = new Sekil1();
        ICizilebilir sekil2 = new Sekil();

        ArrayList<Sekil> list = new ArrayList<>();
        //ya da
        ArrayList<ICizilebilir> list1 = new ArrayList<>(); // şeklinde de yazabilirim

        sekil.ciz();
        sekil1.ciz();
        sekil2.ciz();
    }

}
