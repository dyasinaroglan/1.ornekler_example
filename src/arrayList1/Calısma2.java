package arrayList1;

import java.util.ArrayList;
import java.util.Collections;

public class Calısma2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayılar =new ArrayList<>();
        sayılar.add(16);
        sayılar.add(4);
        sayılar.add(87);
        sayılar.add(67);
        sayılar.add(32);
        Collections.sort(sayılar);  //collections.sort list i sıralar nuamratik ve alfabetik soraya göre

        for (Integer integers : sayılar) {

            System.out.println(integers);
        }
    }
}
