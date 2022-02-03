package Bolum3.Loops;

import java.util.Locale;
import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        /*
        Kullanicidan icinde a ve c de olacak sekilde bir kelime girmesini isteyin.
        Kelime icerisindeki a harflerinin sayisini bulun.
        c harfi görünce program sonlansin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.toLowerCase(Locale.ROOT).charAt(i)== 'a'){
                count++;
            }else if (kelime.toLowerCase(Locale.ROOT).charAt(i) == 'c'){
                break;
                }
            }
        System.out.println("kelime içerisinde bulunan A sayısı = " + count);
        }
    }

