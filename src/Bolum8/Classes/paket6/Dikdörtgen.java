package Bolum8.Classes.paket6;

public class Dikdörtgen {
    double x;
    double y;

    public static Dikdörtgen getDikdörtgen(double a,double b){
        Dikdörtgen d = new Dikdörtgen();
        d.tanımla(a,b);
        return d;
    }

    public void tanımla(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getCevre(){
        return 2*(x+y);
    }
    public double getAlan(){
        return x*y;
    }
}
