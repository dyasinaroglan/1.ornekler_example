package classesExample.Ornek1;

import java.util.ArrayList;

public class Insan {
    String isim;
    ArrayList<Insan> arkadaslar = new ArrayList<>();
    boolean sohbetEtmiyor = true;

    public Insan(String isim,Insan...insanlar){
        this.isim = isim;
        for (Insan insan : insanlar) {
            arkadaslar.add(insan);
        }
    }
    public void arkadasEkle (Insan insan){
        if(!this.arkadaslar.contains(insan)){ //arkadas değillerse arkadaş olarak ekle
            arkadaslar.add(insan);
            insan.arkadasEkle(this); // insanın arkadaşını da this e ekle.
        }

    }
    public void sohbetEt(Insan insan){
        if(!sohbetEtmiyor){
            System.out.println("zaten sohbet ediyorum");
        }else {
            if(arkadaslar.contains(insan)){
                System.out.println("tamam sohbete başladık.");
                sohbetEtmiyor = false;
                insan.sohbetEtmiyor = sohbetEtmiyor;
            }else {
                System.out.println("arkadasım değil ki");
            }
        }
    }

    public void neYapıyorsun(){
        if (sohbetEtmiyor){
            System.out.println("sessizim");
        }else {
            System.out.println("sohbet ediyorum");
        }
    }
    public void yaz(){
        System.out.println(arkadaslar);
    }

    @Override
    public String toString() {
        String arkadasStr = "";
        for (Insan insan : arkadaslar) {
            arkadasStr+=insan.isim+",";
            
        }
        return "Insan" +
                "isim = " + isim +
                "arkadasları=" + arkadasStr;
    }
}
