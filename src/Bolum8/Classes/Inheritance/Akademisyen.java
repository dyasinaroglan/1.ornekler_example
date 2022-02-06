package Bolum8.Classes.Inheritance;

public abstract class  Akademisyen extends Calısan{
    String bolum;
    String gorevler;
    String dersler;

    public void giris(){
        System.out.println(this.getAdSoyad() + " A kapısından giriş yapıldı. ");
        //bu methotun aynısı(aynı isimde) calısan sınıfında da var. fakat burada yaptığımız metot calısan sınıfındaki methodu
        //ezmiş oldu.
    }

    public abstract void derseGir();

    //akademisyen e ait derse gir() methoduna memur erişemicek ya da güvenlik görevlisi.

    public Akademisyen(String adSoyad, int telefon, String eposta, String bolum, String gorevler, String dersler) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler =dersler;
    }

    @Override
    public String toString() {
        return "Akademisyen{" +
                "bolum='" + bolum + '\'' +
                ", gorevler='" + gorevler + '\'' +
                ", dersler='" + dersler + '\'' +
                '}';
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

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }
}
