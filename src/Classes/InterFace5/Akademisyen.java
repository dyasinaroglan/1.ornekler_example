package Classes.InterFace5;

public class Akademisyen implements ICalısan {
    //ICalısanı implements ettiğimizde ICalısan da bulunan methotları burada override etmeliyiz.bize bir kalıp oluşturuyor.
    //ama nesne üretemeyiz.


    String adSoyad, bolum, gorevler;

    public Akademisyen(String adSoyad, String bolum, String gorevler) {
        this.adSoyad = adSoyad;
        this.bolum = bolum;
        this.gorevler = gorevler;
        System.out.println(okul);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }

    @Override
    public void giris() {
        System.out.println("giriş yapıldı");
    }

    @Override
    public void cıkıs() {
        System.out.println("çıkış yağpıldı");
    }

    @Override
    public boolean yemek(int yemekSaati) {
        return false;
    }
}
