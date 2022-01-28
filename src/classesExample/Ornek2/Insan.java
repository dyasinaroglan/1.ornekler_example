package classesExample.Ornek2;

import java.util.ArrayList;

public class Insan {
    String isim;
    Insan muhabbetArkadası;
    ArrayList<Insan> arkadaslar = new ArrayList<>();


    public Insan(String isim, Insan...insanlar) {
        this.isim = isim;
        for (Insan insan : insanlar) {
            arkadaslar.add(insan);
        }
    }
    public void arkadasEkle(Insan insan) {
        if (!this.arkadaslar.contains(insan)) { //eğer arkadaşı insan içermiyorsa yani arkadaşı yoksa
            //insan türünden bir arkadaşı yoksa arkadaş olarak ekle
            arkadaslar.add(insan);
            insan.arkadasEkle(this);//insanı da this e ekle. arkadaşa ekle.
        }
    }
    public void sohbetEt(Insan insan) {
        if (muhabbetArkadası != null) {
            System.out.println("zaten sohbet ediyorum");
        } else {
            if (arkadaslar.contains(insan)) {
                System.out.println("tamam sohbete başladık");
                muhabbetArkadası = insan;
                insan.muhabbetArkadası = this;
            } else {
                System.out.println("arkadaşım değil ki");
            }
        }
    }
    public void neYapıyorsun(){
        if(muhabbetArkadası == null){
            System.out.println("sessisim,kimseyle konuşmuyorum");
        }else {
            System.out.println(muhabbetArkadası.isim + " ile sohbet ediyorum.");
        }
    }
    public void sohbetiKes(){
        if (muhabbetArkadası != null){
            System.out.println("tamam sohbeti kesiyorum");
            muhabbetArkadası.muhabbetArkadası =null;
            muhabbetArkadası = null;
        }else{
            System.out.println("zaten kimseyle konuşmuyorum");
        }
    }
}




