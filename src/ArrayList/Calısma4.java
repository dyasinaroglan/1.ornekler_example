package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Calısma4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(4);
        list.add(67);
        list.add(12);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list); //sort küçükten büyüğe sıralar.
        Collections.reverse(list);
        System.out.println(list); //reverse tersten yazdırma
        Collections.fill(list,264);
        System.out.println(list);  //collections.fill bütün rakamları aynı yapar.
        Collections.replaceAll(list,264,5);
        System.out.println(list);
        Collections.replaceAll(list,5,12);
        System.out.println(list);


    }
}
