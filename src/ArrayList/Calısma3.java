package ArrayList;

import java.util.ArrayList;

public class Calısma3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); //Integer veri tutar.
        ArrayList<String> list2 = new ArrayList<>(); // String veri tutar.
        ArrayList<Double> list3 = new ArrayList<>(); //Double veri tutar.

        ArrayList<String> dersler = new ArrayList<>();

        dersler.add("matematik");
        dersler.add("türkçe");
        dersler.add("fizik");
        dersler.add("almanca");
        dersler.add("ingilizce");
        dersler.add("kimya");

        System.out.println(dersler.size()); //size uzunluk verir.
        dersler.add(3,"edebiyat");
        System.out.println(dersler);
        dersler.set(2,"geometri");  //2.indisteki fizik dersi yerine geometri atadık.
        System.out.println(dersler);
        System.out.println(dersler.get(0));
        dersler.remove(4);
        System.out.println(dersler);

        for (int i = 0; i < dersler.size(); i++) {
            System.out.print(dersler.get(i)+" ");
            dersler.clear();
            System.out.println();
            System.out.println(dersler); //komple siler.

        }




    }
}
