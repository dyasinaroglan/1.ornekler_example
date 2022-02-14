package Bolum4.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsExample4 {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin
        ve sayilari bir metot ile diziye atin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */
        boslugaGöreSıralama("4 12 3 89 54 34");

    }
    public static void boslugaGöreSıralama(String array){ //ben aralarında boşluk olacak şekilde string bir ifade
        //olarak sayıları yazacağım sen de boşluğu gördüğün an boşlukları ayır ve yok et.

        String[] sayılarBosluk = array.split(" ");
        System.out.println(Arrays.toString(sayılarBosluk));

    }
    public static void virgüleGöreSıralama(String array){ //ben aralarına virgül olacak şekilde string olarak sayıları
        //yazacağım. split ile belirtiyorum virgül gördüğünde virgülleri at gitsin
        String[] sayılarVirgül = array.split(",");
        System.out.println(Arrays.toString(sayılarVirgül));
    }
    public static void diziOlusturma(){
        Scanner scanner = new Scanner(System.in);
        String sayılarCumle = scanner.nextLine();
        String[] sayılar = sayılarCumle.split(" ");
        int[] sayılarInt = new int[sayılar.length];

        for (int i = 0; i < sayılar.length; i++) {
            sayılarInt[i] = Integer.parseInt(sayılar[i]);
        }
        System.out.println(Arrays.toString(sayılarInt));

    }
}
