package Bolum8.Classes.Polimorphism2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ornek1 {
    public static void main(String[] args) {

         /*         LİST
                    ArrayList, LinkedList
               SET
                    HashSet, LinkedHashSet, TreeSet
               MAP
                    HashMap, LinkedHashMap, TreeMap
     */

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
       // yazdır(list);  ----> olmaz arrayList tanımladın ama linkedList ram da ayır diyotsun diyor.

        //Ancak ben aşağıda methoda LinkedList in üstü olan LİST tanımlarsam o zaman sıkıntı ortadan kalkar
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        yazdır(list1);
        //yazdır1(list); hata verir

        //ram da ne ayırdığın önemli


    }
    public static void yazdır1(ArrayList<Integer> list){
        list.forEach(n-> System.out.println(n + ","));
    }

    public static void yazdır(List<Integer> list){
        list.forEach(n-> System.out.println(n + ","));
    }
}
