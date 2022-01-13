package Classes.Enum.Enum5;

public enum Kulüp {

    CHELSEA("CHELSEA",1898,"MAVİLER","İNGİLTERE"),
    GALATASARAY("GALATASARAY",1905,"SARI_KIRMIZI","TÜRKİYE"),
    BARCELONA("BARCELONA",1880,"BORDO","İSPANYA"),

    ;
    private String isim;
    private String ülke;
    private int kurulusYılı;
    private String renk;


    Kulüp(String isim, int kurulusYılı, String renk,String ülke) {
        this.isim = isim;
        this.ülke = ülke;
        this.kurulusYılı = kurulusYılı;
        this.renk = renk;

    }

    public String getIsim() {
        return isim;
    }

    public String getÜlke() {
        return ülke;
    }

    public int getKurulusYılı() {
        return kurulusYılı;
    }

    public String getRenk() {
        return renk;
    }

    @Override
    public String toString() {
        return "\n***Kulüp Bilgileri***" +
                "\nKULÜP İSMİ = "+ isim +
                "\nÜLKE = " + ülke +
                "\nKURULUŞ YILI = " + kurulusYılı +
                "\nRENK = " + renk ;
    }
}
