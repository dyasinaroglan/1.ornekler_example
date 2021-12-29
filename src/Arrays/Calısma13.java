package Arrays;

import java.util.Scanner;

public class Calısma13 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin
        bu cümledeki kelime sayisini bulun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle girin");
        String cümle =scanner.nextLine();
        String[] kelime = cümle.split(" ");
        int kelimeSayısı=0;
        for (int i = 0; i < kelime.length; i++) {
            kelimeSayısı++;
        }
        System.out.println("kelime sayısı:"+kelimeSayısı);

    }
}
