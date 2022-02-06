package Bolum8.Classes.Inheritance;

public class Asistan extends Akademisyen {

    String yüksekLisans;
    public Asistan(String adSoyad, int telefon, String eposta, String bolum, String gorevler, String dersler,String yüksekLisans) {
        super(adSoyad, telefon, eposta, bolum, gorevler, dersler);
        this.yüksekLisans = yüksekLisans;
    }

    public String getYüksekLisans() {
        return yüksekLisans;
    }

    public void setYüksekLisans(String yüksekLisans) {
        this.yüksekLisans = yüksekLisans;
    }

    @Override
    public void derseGir() {
        System.out.println(getAdSoyad()+ " "+ getDersler()+ " dersine girdi.");

    }

}
