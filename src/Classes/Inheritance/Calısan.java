package Classes.Inheritance;

public class Calısan {
    private String AdSoyad;
     private int telefon;
    private String eposta;
    static int girisSayısı=0;



    //protected yapsaydım değişkenleri extend olduğu için alt sınıflara sanki public gibi davranacak.

    public void giris() {  //public yerine private yaparsam bu methodu. main de erişemem bu methoda. aynı class haricinde çağırılmaz private.
        //protected yaparsam erişirim.
        System.out.println(this.AdSoyad + " çalışan giriş yaptı");

    }
    public static int girisSayısı(){
        return ++Calısan.girisSayısı;
    }

    public Calısan(String adSoyad, int telefon, String eposta) {
        AdSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public static int getGirisSayısı() {
        return girisSayısı;
    }

    @Override
    public String toString() {
        return "Calısan{" +
                "AdSoyad='" + AdSoyad + '\'' +
                ", telefon=" + telefon +
                ", eposta='" + eposta + '\'' +
                '}';
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    }

