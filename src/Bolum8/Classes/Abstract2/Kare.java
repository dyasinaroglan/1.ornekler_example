package Bolum8.Classes.Abstract2;

public class Kare extends Dikdörtgen {


    public Kare(double uzunluk) {
        super(uzunluk);
    }
    @Override
    public String toString() {
        return "***Kare***" +
                "\nuzunluk = " + uzunluk +
                "\nalanı = "+ alanHesapla()+
                "\nçevresi = "+ cevreHesapla() ;
    }
}
