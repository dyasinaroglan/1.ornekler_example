package classesExample.Ornek3;

public class Main {
    public static void main(String[] args) {
        Insan insan = new Insan("AHMET",true);
        Insan insan1 = new Insan("VELİ",false);
        Arac kepce = new Arac("KEPÇE");


        insan.aracBin(kepce);
        insan.sur();
        insan.aracİn();
        insan.dur();
        insan.aracİn();


    }
}
