package Bolum8.Classes.Extends.extend3;

public class Kamyon extends Arac{

    int yükKapasitesi;


    public Kamyon(Turu türü, int model, int yükKapasitesi) {
        super(türü, model);
        this.yükKapasitesi = yükKapasitesi;
    }
}
