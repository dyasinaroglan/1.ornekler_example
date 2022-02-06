package Bolum8.Classes.ObjectOrientedTekrar.Paket9;

public class Motor extends Makine {
    String isim;
    int gucu;

    public Motor(String tur, int yapımYılı, String isim, int gucu) {
        super(tur, yapımYılı);
        this.isim = isim;
        this.gucu = gucu;
    }

    public void calıs(){
        System.out.println("makine çalışıyor");
    }

    @Override
    public String toString() {
        return "Motor{" +
                "isim='" + isim + '\'' +
                ", gucu=" + gucu +
                '}';
    }
}

//OVERRİDE METHOD---Parent sınıfta olan bir methodun aynısını yani aynı isimlisini alıp o method içerisinde ekleme çıkarma yaptığımızda
// methodu override etmiş oluyoruz.
// yani child class diyor ki senin(parents) methodun benim işime yaramıyor. child methotta aynı isimde methodu çalıştırdığımızda
// artık child methodunda ki methodu çalışıtırır.
