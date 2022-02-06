package Bolum8.Classes.Inheritance2;

public class Kopek extends Hayvan{

     private int disSayısı;

    public Kopek(String isim, int kılo, int boy, int bacakSayısı, int disSayısı) {
        super(isim, kılo, boy, bacakSayısı);
        this.disSayısı = disSayısı;
    }

    public int getDisSayısı() {
        return disSayısı;
    }

    public void setDisSayısı(int disSayısı) {
        this.disSayısı = disSayısı;

        //diğer getter ve setter lar Hayvan class ından zaten geliyor.
    }
    public void kos(int hız){
        System.out.println("köpek koşuyor...");
        super.hareketEt(hız);
        /*
        Hayvan class ında bulunan hareketEt() methodunu super ile çağırıp başka bir methodun içinde kullandık.
         */
    }
}
