package Classes.ObjectOrientedTekrar.Paket3;

public class Arac {
    String marka;
    int model;
    int buAracSayısı;
    static int aracSayısı;

    public void define(String marka,int model){
        this.marka = marka;
        this.model = model;
        buAracSayısı++;
        aracSayısı++;

        // this dediğimiz o nesneyi ifade eder. oluşturulacak nesneyi ifade eder.
        // this dediğimde atıtorum bmw yi kastediyorum. ya da mercedesi. o an hangi nesne ile uğraşıyorsam.
    }
}
