package HashSet;

import java.util.HashSet;

public class Calısma3 {
    public static void main(String[] args) {
        /*
        0-10 arasi random sayilarla 10 elemanli bir hashSeti doldurun
         */

        HashSet<Integer> randomSet = new HashSet<>();

        while (randomSet.size()<10){   //for yaparsak sadece 10 tane döner. ama random sayı aynı sayı gelebilir.
            int num = (int) (Math.random()*10);
            randomSet.add(num);
        }
        System.out.println("random set :"+ randomSet);

    }
}
