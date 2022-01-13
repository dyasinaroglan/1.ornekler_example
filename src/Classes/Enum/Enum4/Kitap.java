package Classes.Enum.Enum4;

public enum Kitap {
    /*
        kitap bilgileri tutan ve gerekli islemleri yapan enum yazin
        adi, yazari, basimYili, sayfaSayisi

     */

    KITAP1("KARAMAZOV KARDEŞLER","DOSTOYEVSKİ",2020,750),
    KITAP2("SEFİLLER","V.HUGO",1995,550),
    KITAP3("MARTİN EDEN","JACK LONDON", 1950,567);



    private String name;
    private String yazarı;
    private int basımYılı;
    private int sayfaSayısı;

    Kitap(String name, String yazarı, int basımYılı, int sayfaSayısı) {
        this.name = name;
        this.yazarı = yazarı;
        this.basımYılı = basımYılı;
        this.sayfaSayısı = sayfaSayısı;
    }

    public String getName() {
        return name;
    }

    public String getYazarı() {
        return yazarı;
    }

    public int getBasımYılı() {
        return basımYılı;
    }

    public int getSayfaSayısı() {
        return sayfaSayısı;
    }

    public String toString() {
        return "\n***Kitap Bilgileri***" +
                "\nname = " + name +
                "\nyazarı = " + yazarı +
                "\nbasımYılı = " + basımYılı +
                "\nsayfaSayısı = " + sayfaSayısı +"\n" ;
    }
}
