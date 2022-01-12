package Classes.PackageStatic.pack1;

public class Main1 {
    public static void main(String[] args) {

        Banka1 b1 = new Banka1();
        b1.sube="A";
        b1.sehir="İSTANBUL"; //BU ZATEN PUBLİC
        //aynı package üzerinde public ve defaultlara ulaştım.
        Banka1.ulke ="AMERİKA";
        Banka1.count = 1; //STATİC OLURSA default olsada aynı package üzerinden ulaşabilirim


    }
}
