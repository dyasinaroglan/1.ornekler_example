package Methods_Arrays;

import java.util.Arrays;

public class Calısma3 {
    public static void main(String[] args) {
        /*
            Tanimlanmis bir int array"in max ve min degerlerini baska bir arraye atiniz
            Örnek : int[] arr = {1,-2, 5, 8, 9, 3};
         */

        int[] array ={3,23,89,5,34};

        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if(i>max) max=i;
            if(i<min) min=i;

        }
        System.out.println("max değeri:"+max+"min değeri:"+min);

        int[] newArray = {max,min};
        System.out.println(Arrays.toString(newArray));



    }
}
