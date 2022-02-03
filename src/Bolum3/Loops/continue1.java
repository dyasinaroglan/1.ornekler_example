package Bolum3.Loops;

import java.util.Scanner;

public class continue1 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin. Cümledeki her harfi alt alta
        yazdirin. Bosluk gelirse boslugu yazdirmayin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle = scanner.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' '){
                continue;
            }
            System.out.print(cumle.charAt(i));
        }

    }
}
