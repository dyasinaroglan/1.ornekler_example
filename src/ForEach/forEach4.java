package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

public class forEach4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.removeIf(n-> n%2 == 0);  //removeIf şarta uyuyorsa çıkar listeden.
        //bunu list,map ve set'lerde kullanabiliriz.
        System.out.println(list);

    }
}
