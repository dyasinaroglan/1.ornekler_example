package classesExample.Antreman;

public class Kitap1 {
        String adi;
        int basimYili;
        int sayfaSayisi;
        static int kitapSayısı=0;

        public Kitap1(String adi, int basimYili, int sayfaSayisi) {
                this.adi = adi;
                this.basimYili = basimYili;
                this.sayfaSayisi = sayfaSayisi;
                kitapSayısı++;

        }
        public void getKitapBilgisi(){
                System.out.println("kitap adı : "+adi+"\nkitap basım yılı : "+basimYili+"\nkitap sayfa sayısı : "+sayfaSayisi);
        }
        public static void kitapSayısıYaz(){
                System.out.println("toplam kitap sayısı="+kitapSayısı);
        }
}
