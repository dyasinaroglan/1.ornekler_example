package Classes.StaticKavramı;

public class Memur {
    String isim;
    int maas;
    //kaç tane memur sayısını görmek istiyorsak
     static int memurSayısı;

    public Memur() {
       memurSayısı++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas < 0) {
            maas = 0;
        } else {
            this.maas = maas;
        }
    }
    public void bilgileriYazdır(){
        System.out.println("oluşturulan memurlar nesnesi:"+memurSayısı);

    }
}
//not: statik metotlar statik olmayan nesneye ait olan metotlara erişemez.
//ancak statik metodun içine nesneye ait bir metodu yazdırabiliriz.
