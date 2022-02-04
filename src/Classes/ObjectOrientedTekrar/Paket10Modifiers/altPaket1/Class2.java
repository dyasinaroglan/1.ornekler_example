package Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket1;

public class Class2 {
    private int class2Private;
    int class2Default; //hiçbir şey yazmıyorsam default zaten
    protected int class2Protected;
    public int class2Public;


    public static void main(String[] args) {
        Class1 c = new Class1();
        // c.class1Private = 1; bunu görmedi,çünkü farklı sınıflar. private sadece aynı sınıflar içinde yani sınıfın kendi içinde ulaşabiliriz.
        //ancak bu methıda setter ile ulaşabilirim.
        c.class1Default = 2;
        c.class1Protected = 3;
        c.class1Public = 4;
        c.setClass1DefaultMethod(); //şeklinde ulaşırım setter ile.
    }
}
