package Methods_Arrays;

import java.util.Arrays;

public class Calısma1 {
    public static void main(String[] args) {

        int[] arr2 = new int[5]; //bellekte yer ayırdık 5 tane integer yeri kadar.

        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;
        //arr2[5]=6; //hata verir. çünkü indisler o ile başlar

        System.out.println(arr2[3]);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        //for each yöntemi ile yazdıralım.
        System.out.println();
        for (int i : arr2) {
            System.out.print(i+",");
            System.out.println(Arrays.toString(arr2));

        }

    }
}
