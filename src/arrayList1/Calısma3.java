package arrayList1;

import java.util.ArrayList;

public class Calısma3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(13);
        list.add(24);
        //listenin içerisinde 12 sayısı var mı? contains

        boolean varMı = list.contains(12);
            if(varMı){
                System.out.println("vardır");
            }
            else {
                System.out.println("yoktur");

            }
    }
}
