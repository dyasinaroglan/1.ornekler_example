package Classes.paket1;

public class Kitap {
    String adı ;
    int basımYılı;                     //instance nesnenin veriable ları.(örnek değişkenler)
    int sayfaSayısı;
    static int kitapSayısı;  //STATİC OLUP Kitap CLASS'ına ait olan veriables.


    public void kitapTanımla(String adı,int basımYılı,int sayfaSayısı){  //INSTANCE METHOD
        this.adı=adı;
        this.basımYılı=basımYılı;
        this.sayfaSayısı=sayfaSayısı;
        kitapSayısı++; //NEDEN BURAYA YAZDIK? çünkü her kitap tanımladığımda kitap sayısını bir arttırsın.
        //normalde class'ın altındaki staticlere Kitap.kitapSayısı deyip ulaşırım. ama bu aynı class'ın içinde olduğu için
        //kitapSayısı++; diyebiliyorum.
    }
    public void getKitapBilgisi(){ //INSTANCE METHOD
        System.out.println("kitabın adı: "+adı+"\nkitabın basım yılı:"+basımYılı+"\nkitabın sayfa sayısı:"+sayfaSayısı);
    }
    public static void kitapSayısıYaz(){  //CLASS METHODU herkesin ulaşması için.
        System.out.println("toplam kitap sayısı:"+ kitapSayısı);
        //kitapSayısı yerine basımYılı veya adı yazamam.çünkü STATİC'DEN DİNAMİĞE ULAŞMAM MÜMKÜN DEĞİL.
    }


}
