package Arrays;

import java.util.Scanner;

public class Calısma5 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alin ve bu sayilarin tek olanlarini sayisini bulun
         */

        Scanner scanner = new Scanner(System.in);

        int[] array =new int[5];
        int count =0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz");
            array[i] = scanner.nextInt();
            if(array[i]%2==1){
                count++;
            }
        }
        System.out.println("tek sayılar:"+count);

    }
}
