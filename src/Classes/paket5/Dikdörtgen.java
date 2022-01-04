package Classes.paket5;

import Classes.paket4.Boyut;

public class Dikdörtgen {
    double x;
    double y;

    public static Dikdörtgen getDikdörtgen(double a,double b){
        Dikdörtgen d = new Dikdörtgen();
        d.tanımla(a,b);
        return d;
        //CLASS(Dikdörtgen classı kendi classı içinde kendi adında return edebilir.
    }

    public void tanımla(double x,double y){
        this.x =x;
        this.y=y;
    }
    public double getCevre(){
        return 2*(this.x+ this.y);
    }
    public double getAlan(){
        return (this.x* this.y);
    }
}
