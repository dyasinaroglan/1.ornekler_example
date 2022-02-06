package Bolum8.Classes.Inheritance;

public class OgretimUyesi extends Akademisyen{

    String unvan;

    public OgretimUyesi(String adSoyad, int telefon, String eposta, String bolum, String gorevler, String dersler,String unvan) {
        super(adSoyad, telefon, eposta, bolum, gorevler, dersler);
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }


    public void derseGir(int dersSaati) {
        System.out.println(getUnvan()+ " "+ getAdSoyad()+ " "+ dersSaati +" saat "+ getDersler()+ " dersine girdi.");

    }

    @Override
    public void derseGir() {

    }
}
