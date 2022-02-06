package Bolum8.Classes.StringBuffer;

public class String_Buffer {
    public static void main(String[] args) {

        //String değişkenler immutable dır. sayılamayan, üzerinde değişiklik yapılamayan değişkenler.

        String str ="java";
        str.substring(1,3); //str de değişiklik yapmaz.
        System.out.println(str);
        str+= " dünya";
        System.out.println(str);
        System.out.println("******************");
        //mutable
        StringBuffer buffer = new StringBuffer();  //bunlarla string üzerinde değişikşik yapabiliyoruz.
        buffer.append("java");
        System.out.println(buffer);
        buffer.reverse(); //string ifadeyi tersten yazdırma
        System.out.println(buffer);
        buffer.append(" dünya");
        buffer.reverse();
        System.out.println(buffer);
        buffer.indexOf(String.valueOf(4));
        System.out.println("****************");
        System.out.println(buffer);


    }
}
