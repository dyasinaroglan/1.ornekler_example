package Bolum8.Classes.ObjectOrientedTekrar.Paket6;

public class Insan {
    String isim;

    public Insan(String isim) {
        this.isim = isim;
    }

    public void aracBın(Arac arac){
        if(arac.mevcutYolcu<arac.yolcuKapasitesi) {
            arac.yolcular.add(this);
            arac.mevcutYolcu++;
            System.out.println(isim + " araca bindi");
        }else {
            System.out.println("araç dolu nasıl bineyim ");
        }

    }

    @Override
    public String toString() {
        return isim ;
    }
}
