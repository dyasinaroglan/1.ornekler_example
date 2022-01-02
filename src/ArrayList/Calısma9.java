package ArrayList;

import java.util.ArrayList;

public class Calısma9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each)) {  // each ile resultun içine bak var mı yok
                continue;
            }
            result.add(each);  // result un içerisine each de olan elemanları ekle.
        }
        System.out.println(result);
    }
}
