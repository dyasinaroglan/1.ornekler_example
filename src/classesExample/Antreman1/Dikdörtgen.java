package classesExample.Antreman1;

public class Dikdörtgen {
    Boyut boyut;

    public void tanımla(int x,int y){
        //bu şekilde creat edilmemiştir. dışardan boyut tanımlanmaış x ve y olarak gelmiş.
        boyut = new Boyut();
        boyut.x=x;
        boyut.y=y;
    }
    public void tanımla(Boyut boyut){
        //boyut dışarıdan geliyor.burada
        this.boyut=boyut;
    }
    public double cevre(){
        return 2*(boyut.x+boyut.y);
    }
    public double alan(){
        return boyut.x* boyut.y;
    }
}
