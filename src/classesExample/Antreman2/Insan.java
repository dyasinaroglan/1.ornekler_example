package classesExample.Antreman2;

import java.util.ArrayList;

public class Insan {
    static int count ;
    String adi;
    int yasi;
    ArrayList<String> akrabalari = new ArrayList<>();

    public void veriAta(String adi, int yasi){
        this.adi = adi;
        this.yasi = yasi;
        Insan.count++;
        System.out.println(this.adi + ","+ this.yasi);

    }
    public void akrabaAta(String...akrabaİisimleri){

        for (String s : akrabaİisimleri) {
            akrabalari.add(s);

        }

    }
    public void akrabalarınıSoyle(){
        System.out.println(akrabalari);
    }



}
