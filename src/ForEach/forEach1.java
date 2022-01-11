package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

public class forEach1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer+",");
        }
        System.out.println();
        //lambda
        list.forEach(integer -> System.out.print(integer+",")); //ArrayList,Map ve Set'lerde kullanabiliriz ForEach yöntemini.
        System.out.println();
    }
    public static void yaz(int integer){
        System.out.println(integer+",");
    }

}
