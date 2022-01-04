package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Calısma7 {
    public static void main(String[] args) {
        HashSet h = new HashSet();

        h.add(12);
        h.add("12 str");
        h.add(12.0);
        h.add(true);

        System.out.println(h.size());
        h.remove(12);
        Iterator itr = h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       h.forEach(i-> System.out.println(i+" "));
    }
}
