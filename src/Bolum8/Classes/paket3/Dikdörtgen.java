package Bolum8.Classes.paket3;

public class Dikdörtgen {
    Boyut boyut;  //Boyut türünden bir boyut tutacak. boyut neyden oluşuyor x ve y'den.
    //double x;
    //double y; aslında

    public void tanımla(double x,double y){ //iç içe classlar
        boyut = new Boyut();
        boyut.x = x;
        boyut.y =y;
    }
    public double getCevre(){
        return 2*(boyut.x+ boyut.y);

    }
    public double getAlan(){
        return boyut.x * boyut.y;
    }
}
