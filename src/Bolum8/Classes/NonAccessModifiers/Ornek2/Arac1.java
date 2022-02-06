package Bolum8.Classes.NonAccessModifiers.Ornek2;

public class Arac1 {
    private int model;
    private Tip tip;
    private Marka marka;
    private int fiyat;
    public Arac1 hediyesi;

    public Arac1(Tip tip, Marka marka,int model) {
        this.tip = tip;
        this.marka = marka;
        this.model =model;
        hediyesi=new Arac1(Tip.HATCHBACK,Marka.MAZDA,2020);
        //HEDİYE

    }

    public Arac1(int model, Tip tip, Marka marka, int fiyat) {
        this(tip, marka, model);
        this.fiyat = fiyat;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


    public String toString() {
        return "Arac1 Bilgileri" +
                "\nmodel=" + model +
                "\ntip=" + tip +
                "\nmarka=" + marka +
                "\nfiyat=" + fiyat ;
    }
}
