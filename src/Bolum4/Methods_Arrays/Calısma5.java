package Bolum4.Methods_Arrays;

import java.util.Arrays;

public class Calısma5 {
    public static void main(String[] args) {

        //girilen bir string in harflerini array return edin.
        String str ="java dünyası";
        System.out.println(Arrays.toString(getStringArray(str)));

    }
    public static String[] getStringArray(String str){
        return str.toUpperCase().split("");
    }
}
