package Bolum3.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***ÜNLÜ HARFLER***");
        String unlu;
        unlu = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (unlu){
            case "a" :
                System.out.println("vowel");
                break;
            case "e" :
                System.out.println("vowel");
                break;
            case "ı" :
                System.out.println("vowel");
                break;
            case "i" :
                System.out.println("vowel");
                break;
            case "o" :
                System.out.println("vowel");
                break;
            case "ö" :
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}
