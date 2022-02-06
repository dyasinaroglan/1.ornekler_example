package Bolum8.Classes.ObjectOrientedTekrar.Paket9;

public class Makine {
    String tur;
    int yapımYılı;
    static int makineSayısı;

    public Makine(String tur, int yapımYılı) {
        this.tur = tur;
        this.yapımYılı = yapımYılı;
        makineSayısı++;
    }
    public static int getMakineSayısı(){
        return makineSayısı;

    }
    public void calıs(){
        System.out.println("makineye özel");
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYapımYılı() {
        return yapımYılı;
    }

    public void setYapımYılı(int yapımYılı) {
        this.yapımYılı = yapımYılı;
    }

    public static void setMakineSayısı(int makineSayısı) {
        Makine.makineSayısı = makineSayısı;
    }

    @Override
    public String toString() {
        return "Makine{" +
                "tur='" + tur + '\'' +
                ", yapımYılı=" + yapımYılı +
                '}';
    }
}
