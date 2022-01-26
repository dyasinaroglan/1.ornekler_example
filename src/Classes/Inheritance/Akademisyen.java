package Classes.Inheritance;

public class Akademisyen extends Calısan{
    String bolum;
    String gorevler;
    String dersler;

    public void derseGir(){
        System.out.println("derse girildi.");
    }

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
}
