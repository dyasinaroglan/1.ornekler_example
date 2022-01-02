package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Calsıma11 {
    public static void main(String[] args) {
        /*
1. Ülkeler adında bir dizi dizi oluşturun.bunu arrayList in içine atın.

2. Uzunluğu 10 veya daha büyük olan tüm ülke adlarını kaldırabilen bir program yazın
  */

        String[] ülkeler = {"TURKEY","UNITED KİNGDOM","FİNLAND","UNITED STATES","CANADA"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(ülkeler));
        list.removeIf(p-> p.length()>=10);
        ülkeler=list.toArray(new String[0]);
        System.out.println(Arrays.toString(ülkeler));
    }
}
