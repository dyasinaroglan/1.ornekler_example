package Bolum8.Classes.paket2;

public class Kitapp {
    String adı;
    int sayfaSayısı;
    int basımYılı;
    static int kitapSayısı;

    public void kitapTanımla(String adı,int sayfaSayısı,int basımYılı){
        this.adı= adı;
        this.sayfaSayısı=sayfaSayısı;
        this.basımYılı=basımYılı;
        kitapSayısı++;
    }
    public void getKitapBilgisi(){
        System.out.println("kitabın adı: "+adı+"\nkitabın sayfa sayısı: "+sayfaSayısı+"\nkitabın basım yılı: "+basımYılı);
    }
    public static void kitapSayısıYaz(){
        System.out.println("kitap sayısı= "+ kitapSayısı);
    }
}
