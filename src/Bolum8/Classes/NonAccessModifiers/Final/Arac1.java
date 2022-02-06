package Bolum8.Classes.NonAccessModifiers.Final;

import java.util.ArrayList;
import java.util.Arrays;

public class Arac1 {
    final static String name="  java";
    final static ArrayList<Integer> listfinal = new ArrayList<>(Arrays.asList(1,2,3,4,5));
     static ArrayList<Integer> normallist = new ArrayList<>(Arrays.asList(3,6,9,12,15));



    public static void main(String[] args) {

        System.out.println(name);
        //name ="ali"; diyemem çünkü name artık initiliaze olmuş ve final. nihai değer. değişiklik yapamam.
        //ama üzerinde oynama yaparım

        System.out.println(name.trim());
        System.out.println(name.trim().substring(0,2)); //bu şekilde işlemler yapabilirim.
        System.out.println("************************");
        //arrayListler de final olsa da işlemler yapar; ekleme,çıkarma, silme vb. işlemler yapabiliriz.
        //fakat tanımlanmış bir arraylist e tekrar başka bir arraylist tanımlayamam.
        System.out.println(listfinal);
        System.out.println("*************************");
        listfinal.add(10);
        listfinal.remove(3);
        System.out.println(listfinal);
        //listfinal = new ArrayList<>(Arrays.asList(34,56,78));  BUNU YAPAMIYORUM.
        System.out.println("*************************");
        System.out.println(normallist);
        System.out.println("*************************");
        normallist.add(34);
        normallist.remove(2);
        System.out.println(normallist);
        System.out.println("*************************");
        normallist =new ArrayList<>(Arrays.asList(10,20,30)); //bu şekilde atama yapabilirim.
        System.out.println(normallist);
    }
}
