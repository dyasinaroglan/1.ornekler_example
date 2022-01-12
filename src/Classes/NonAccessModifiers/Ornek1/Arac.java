package Classes.NonAccessModifiers.Ornek1;

public class Arac {
    private String marka;
    private int model;
    private int fiyat;

    public Arac(String marka, int model) {
        this.marka = marka;
        this.model=model;
    }

    public Arac(String marka, int model, int fiyat) {
        this(marka,model);
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if(marka.length()>3) //markanın lengti 3 ten büyükse güncellesin
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if ((model>2010)) {
            this.model = model;
        }
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if(this.fiyat==0 && fiyat>0)  //this.fiyat 0 ise(yani girilmemişse) ve methodun içindeki fiyat
            //0 dan büyükse fiyatı güncelle.
            this.fiyat = fiyat;
        else if(this.fiyat>0 && fiyat>this.fiyat*0.9)//yukarıdaki fiyat o dan büyükse(yani girilmişse)
            //ve methottan gelen fiyat girilen fiyatın %90 ınından daha küçük değilse güncelle
            this.fiyat=fiyat;
    }


    public String toString() {
        return "Araç Bilgileri" +
                "\nmarka = " + marka +
                "\nmodel = " + model +
                "\nfiyat = " + fiyat ;
    }
}
