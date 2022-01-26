package Classes.Inheritance;

public class OgretimUyesi extends Akademisyen{

    String unvan;

    public OgretimUyesi(String adSoyad, int telefon, String eposta, String bolum, String gorevler, String dersler,String unvan) {
        super(adSoyad, telefon, eposta, bolum, gorevler, dersler);
        this.unvan = unvan;
    }

}
