package Bolum8.Classes.paket7;

public class Islem {
    double val;
    public void set(double val){
        this.val=val;
    }
    public void topla(double x){
        val+=x;
    }
    public void cıkar(double y){
        val-=y;
    }
    public void yaz(){
        System.out.println("sonuç:"+val);
    }
}
