package Classes.paket4;

public class Dikdörtgen {
    Boyut boyut;


    public void tanımla (double x,double y){
        boyut = new Boyut();
        boyut.x =x;
        boyut.y=y;
    }
    public double getCevre(){
        return 2*(boyut.x+ boyut.y);
    }
    public double getAlan(){
        return (boyut.x* boyut.y);
    }


}
