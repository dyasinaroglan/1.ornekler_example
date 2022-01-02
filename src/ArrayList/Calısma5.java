package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Calısma5 {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("mehmet","ali","veli"));

        ArrayList<String> dersler = new ArrayList<>(Arrays.asList("matematik","türkçe","geometri"));

        isimler.addAll(dersler);
        System.out.println("isimler:"+isimler);  //dersler listesini isimler listesine ekledim.

        isimler.removeAll(dersler);
        System.out.println("isimler:"+isimler); //dersler listesini isimler listesinden çıkardım

        if(isimler.contains("mehmet"))
            System.out.println("mehmet isimler listesinde var");
        else
            System.out.println("mehmet yok");









    }
}
