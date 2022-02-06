package Bolum8.Classes.ObjectOrientedTekrar.Paket9;

public class TesviyeMakinesi extends Makine {
    String isim;
    int calısanSayısı;

    public TesviyeMakinesi(String tur, int yapımYılı, String isim, int calısanSayısı) {
        super(tur, yapımYılı);
        this.isim = isim;
        this.calısanSayısı = calısanSayısı;
    }

    public void calıs(){
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+ ", TesviyeMakinesi{" +
                "isim='" + isim + '\'' +
                ", calısanSayısı=" + calısanSayısı +
                '}';
    }
}

   //OVERRİDE METHOD---Parent sınıfta olan bir methodun aynısını yani aynı isimlisini alıp o method içerisinde ekleme çıkarma yaptığımızda
   // methodu override etmiş oluyoruz.
   // yani child class diyor ki senin(parents) methodun benim işime yaramıyor. child methotta aynı isimde methodu çalıştırdığımızda
// artık child methodunda ki methodu çalışıtırır.
