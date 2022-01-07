package classesExample.UdemyOrnek;

public class Cember {

    double pi;
    int yarıCap;


   /* public int cevre(int yarıCap, double pi){
        this.pi=pi;
        this.yarıCap=yarıCap;
        return (int) (2*pi*yarıCap);
    }
    public int alan(int yarıCap,double pi){
        this.pi=pi;
        this.yarıCap=yarıCap;
        return (int) (Math.pow(yarıCap,2)*pi);
    }

    */

    public Cember(int yarıCap,double pi) {
        this.yarıCap = yarıCap;
        this.pi=pi;
    }

    public double cevre(){
        return 2*pi*yarıCap;
    }
    public double alan(){
        return pi* (Math.pow(yarıCap,2));
    }
}
