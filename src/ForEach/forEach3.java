package ForEach;

import java.util.HashMap;
import java.util.Map;

public class forEach3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");

       for(Map.Entry<Integer,String> entry : map.entrySet()){
           System.out.println(entry.getValue()+","+entry.getKey());
       }
        System.out.println("-------------------------------------");
       map.forEach((k,v)-> System.out.println(k+","+v)); //2 li k ve v gelecek diyorum.
        //önemli olan kaç eleman geliyor. iki eleman gelidiğinde ise paranteze alıyor.
        //foreach tipini zaten biliyor.
    }
}
