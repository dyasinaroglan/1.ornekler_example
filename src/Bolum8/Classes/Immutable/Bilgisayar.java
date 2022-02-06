package Bolum8.Classes.Immutable;

public class Bilgisayar {
    private int cekirdekSayısı;
    private int ram;
    private String[] üreticiFirmalar;

    public Bilgisayar(int cekirdekSayısı, int ram, String[] üreticiFirmalar) {
        this.cekirdekSayısı = cekirdekSayısı;
        this.ram = ram;
        this.üreticiFirmalar = üreticiFirmalar;
    }

    public int getCekirdekSayısı() {
        return cekirdekSayısı;
    }

    public int getRam() {
        return ram;
    }
    public String[] getÜreticiFirmalar() {
        return üreticiFirmalar;
    }

}
