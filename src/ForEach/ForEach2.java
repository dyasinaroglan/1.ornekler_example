package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (Integer n : list) {     //ınteger list in içindeki n sayıları kadar * yazdır.
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        list.forEach(n-> {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();  //süslü parantez açıp for döngüsüne sokuyoruz. birden fazla işlem var çünkü
        });
    }
    }
