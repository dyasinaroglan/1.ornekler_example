package Classes.ObjectOrientedTekrar.Paket6;

import java.util.ArrayList;

public class Arac {
    String isim;
    int yolcuKapasitesi;
    int mevcutYolcu;

    ArrayList<Insan> yolcular = new ArrayList<>();

    public Arac(String isim, int yolcuKapasitesi) {
        this.isim = isim;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
    public void yolcuAl(Insan yolcu) {
        if (yolcuKapasitesi > mevcutYolcu){
            yolcular.add(yolcu);
        mevcutYolcu++;
            System.out.println(yolcu.isim + " yolcu bindi");
    }
        else
        System.out.println("araçta yer yok");
    }
    public void yolcuIndır(Insan yolcu){
        if(yolcular.contains(yolcu)) {
            yolcular.remove(yolcu);
            mevcutYolcu--;
            System.out.println(yolcu.isim + " yolcu indirildi");
        }else {
            System.out.println(yolcu.isim + " böyle bir yolcu yoktur.");
        }
    }
    public void yolcuListesi(){
        System.out.println("yolcu listesi");
        int i = 1;
        for (Insan yolcu : yolcular) {
            System.out.println(i++ + ". yolcu " + yolcu);
            
        }
    }
}
