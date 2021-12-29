package arrayList1;

import java.util.ArrayList;

public class Calısma4 {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(4);
        liste.add(56);
        liste.add(45);
        liste.add(21);

        liste.clear();
        System.out.println("toplam eleman sayısı:"+ liste.size());
    }
}
