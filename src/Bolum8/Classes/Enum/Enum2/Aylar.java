package Bolum8.Classes.Enum.Enum2;

public enum Aylar {

    OCAK(31), ŞUBAT(28), MART(31), NİSAN(30), MAYIS(31), HAZİRAN(30),
    TEMMUZ(31), AĞUSTOS(31), EYLÜL(30), EKİM(31), KASIM(30), ARALIK(31) ;

    //constructor class da oluşur. bu da bir class dır.

    //Aylar class ının puplic static final şeklinde oluşturulması gibi düşünebiliriz.


    private int gunSayısı;

    Aylar(int gunSayısı) {
        this.gunSayısı = gunSayısı;
    }

    public int getGunSayısı() {
        return gunSayısı;
    }


    public String toString() {
        return "Aylar\n" +
                "gunSayısı = " + gunSayısı ;
    }
}
