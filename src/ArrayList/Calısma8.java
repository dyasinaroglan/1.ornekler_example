package ArrayList;

import java.util.ArrayList;

public class Calısma8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) {
           list.set(i, list.get(i)*2 );

        }
        System.out.println(list);

    }
}
