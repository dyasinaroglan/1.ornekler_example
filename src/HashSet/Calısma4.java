package HashSet;

import java.util.HashSet;
import java.util.logging.Handler;

public class Calısma4 {
    public static void main(String[] args) {
        /*
        0-10 arasi random sayilarla 10 elemanli bir hashSeti doldurun
         */

        HashSet<Integer> randomSayılar = new HashSet<>();

        while (randomSayılar.size()<10){
            int num = (int) (Math.random()*10);
            randomSayılar.add(num);
        }
        System.out.println("random sayılar:"+ randomSayılar);
    }
}
