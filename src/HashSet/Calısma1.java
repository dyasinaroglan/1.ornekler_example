package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Calısma1 {
    public static void main(String[] args) {
        /*
        iki hashset oluşturup bu iki hashseti birleştiren bir metot yazalım.
        sonra bu hashsetin farklarını bulalım
        ve en son da ortak elemanlarını bulalım.
         */
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(5,6,7,8));
        System.out.println("birleşririlmiş hali:"+ birlestir(set1,set2));
        System.out.println("fark:"+ fark(set1,set2));
        System.out.println("ortak elemanlar:"+ ortak(set1,set2));


    }
    public static HashSet<Integer> birlestir(HashSet<Integer> hashSetIntegers1, HashSet<Integer> hashSetIntegers2){
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(hashSetIntegers1);
        birlesikSet.addAll(hashSetIntegers2);
        return birlesikSet;
    }
    public static HashSet<Integer> fark (HashSet<Integer>hashSetIntegers1,HashSet<Integer>hashSetIntegers2){
        HashSet<Integer> farkSet =new HashSet<>(hashSetIntegers2);
        farkSet.removeAll(hashSetIntegers1);
        return farkSet;
    }
    public static HashSet<Integer> ortak(HashSet<Integer>hashSetIntegers1,HashSet<Integer>hashSetInteger2){
        HashSet<Integer> ortakSet = new HashSet<>(hashSetIntegers1);
        ortakSet.retainAll(hashSetInteger2);
        return ortakSet;
    }
}
