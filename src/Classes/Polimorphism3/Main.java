package Classes.Polimorphism3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Set.of(34,2,12,120,5,1002));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();  //bizim girdiğimz sıraya göre sıralar.

        set2.add(34);
        set2.add(2);
        set2.add(12);
        set2.add(120);
        set2.add(5);
        set2.add(1002);

        Set<Integer> set3 = new TreeSet<>(); //numaratik ve alfabetik sıraya göre sıralar ve en yavaş olanı budur.
        set3.add(34);
        set3.add(2);
        set3.add(12);
        set3.add(120);
        set3.add(5);
        set3.add(1002);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        yazdır(set1);
        yazdır(set2);
        yazdır(set3);

    }
    public static void yazdır(Set<Integer> set){
        System.out.println(set); //hepsini kapsayan set tanımladığımda set1,set2 ve set3 de hepsini kabul eder.
    }
}
