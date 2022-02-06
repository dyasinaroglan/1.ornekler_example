package Bolum4.Arrays;

import java.util.Scanner;

public class Calısma7 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane email alin. Bu emaillerde @ isareti olmayanlarin miktarini bulun.
         */

        Scanner scanner = new Scanner(System.in);
        int count=0;
        String[] email = new String[5];

        for (int i = 0; i < email.length; i++) {
            System.out.println("e mail girin");
            email[i]=scanner.nextLine();
            if(!email[i].contains("@")){
                count++;
            }
        }
        System.out.println("@ olmayan email sayısı:"+count);
    }
}
