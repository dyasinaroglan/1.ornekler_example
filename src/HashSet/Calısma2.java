package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Calısma2 {
    public static void main(String[] args) {
        /* İki tane String bir hashmap oluşturalım. bu iki hashmapi birleştiren ,farklarını bulan ve
        ortak elemnalarını bulan bir metot yazalım.

         */
        HashSet<String> names1 = new HashSet<>(Arrays.asList("ahmet","burak","yasin","kemal","mehmet"));
        HashSet<String> names2 = new HashSet<>(Arrays.asList("yasin","cemal","ali","veli"));

        System.out.println("birleştirilmiş hali:"+ birlestir(names1,names2));
        System.out.println("farkalr:"+ fark(names1,names2));
        System.out.println(ortakEleman(names1,names2));

    }
    public static HashSet<String> birlestir (HashSet<String> set1,HashSet<String> set2){
        HashSet<String> birlestirSet = new HashSet<>(set1);
        birlestirSet.addAll(set2);
        return birlestirSet;
    }
    public static HashSet<String> fark (HashSet<String> set1,HashSet<String> set2){
        HashSet<String> farkSet = new HashSet<>(set1);
        farkSet.removeAll(set2);
        return farkSet;
    }
    public static HashSet<String> ortakEleman (HashSet<String> set1,HashSet<String> set2){
        HashSet<String> ortakSet = new HashSet<>(set1);
        ortakSet.retainAll(set2);
        return ortakSet;
    }
}
