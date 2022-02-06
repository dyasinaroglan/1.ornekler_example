package Bolum8.Classes.Inheritance2;

public class Hayvan {
    private String isim;
    private int kılo;
    private  int boy ;
    private int bacakSayısı;

    public Hayvan(String isim, int kılo, int boy, int bacakSayısı) {
        this.isim = isim;
        this.kılo = kılo;
        this.boy = boy;
        this.bacakSayısı = bacakSayısı;
    }
    public void yemekYe(){
        System.out.println("yemek yiyiyorum");
    }
    public void hareketEt(int hız){
        System.out.println("hayvan "+ hız + " ile hareket ediyor...");

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKılo() {
        return kılo;
    }

    public void setKılo(int kılo) {
        this.kılo = kılo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacakSayısı() {
        return bacakSayısı;
    }

    public void setBacakSayısı(int bacakSayısı) {
        this.bacakSayısı = bacakSayısı;
    }
}
