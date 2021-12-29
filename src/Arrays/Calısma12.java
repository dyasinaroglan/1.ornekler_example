package Arrays;

import java.util.Scanner;

public class Calısma12 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin
        bu cümledeki kelime sayisini bulun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle =scanner.nextLine();
        String[] str = new String[cümle.length()]; // yazdığım cümle mi str adlı diziye attım. cümlenin uzunluğu kadar bir str
        int kelimeSayısı =1;

        for (int i = 0; i < str.length; i++) {
            if(cümle.charAt(i)== ' '){  //str dizisinin içindeki cümlemin boşluklarını char ile çekiyorum.
                kelimeSayısı++;
            }
        }
        System.out.println("kelime sayısı:"+kelimeSayısı);
    }
}
