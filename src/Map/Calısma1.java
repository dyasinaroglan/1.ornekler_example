package Map;

import java.util.HashMap;
import java.util.Map;

public class Calısma1 {
    public static void main(String[] args) {




        HashMap<String,Integer> ogrNotlar = new HashMap<>();
        //SOL ---> KEY  SAĞ--->VALUE denir
        ogrNotlar.put("yasin",90);
        ogrNotlar.put("ahmet",56);
        ogrNotlar.put("abdullah",78);
        ogrNotlar.put("rukiye",100);
        ogrNotlar.put("yasin",99); // yasin den iki tane var. en son yazdığımızı alıyor. başa ahmet geçiyor.

        System.out.println(ogrNotlar);
        System.out.println(ogrNotlar.get("ahmet")); //ahmetin notları getir.
        System.out.println(ogrNotlar.get("yasin"));
        System.out.println(ogrNotlar.size());
        System.out.println(ogrNotlar.put("cemal",50));
        System.out.println(ogrNotlar.clone());
        ogrNotlar.remove("abdullah");
        System.out.println(ogrNotlar); //abdullahı sildi
        System.out.println(ogrNotlar.keySet());
        System.out.println(ogrNotlar.values());
        //for döngüsüne nasıl sokarız.



        for (Map.Entry<String,Integer> keyVeValues : ogrNotlar.entrySet()){
            System.out.println("isim: "+ keyVeValues.getKey()+" \nnotu: "+keyVeValues.getValue());
        }
        boolean buKeyVarMı = ogrNotlar.containsKey("ahmet");
        boolean buValuesVarMı =ogrNotlar.containsValue(100);
        System.out.println(buKeyVarMı+" "+ buValuesVarMı);

        ogrNotlar.remove("ahmet");
        ogrNotlar.clear();
        System.out.println(ogrNotlar);




    }
}
