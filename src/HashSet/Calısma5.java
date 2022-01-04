package HashSet;

import java.util.HashSet;

public class Calısma5 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        // sadece integer veri tutabilir.
        HashSet<String> string = new HashSet<>();
        //Sadece String veri tutabilir.

        HashSet<Object> objectSet = new HashSet<>();
        objectSet.add("yasin");
        objectSet.add(23);
        objectSet.add(3.2);
        objectSet.add(true);

        System.out.println(objectSet);  //her türden veriyi tutabilir bu şekilde.
    }
}
