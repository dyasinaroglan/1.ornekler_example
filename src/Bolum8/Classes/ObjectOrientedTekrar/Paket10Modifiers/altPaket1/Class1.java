package Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket1;

public class Class1 {

    private int class1Private;
    int class1Default; //hiçbir şey yazmıyorsam default zaten
    protected int class1Protected;
    public int class1Public;


    private void class1PrivateMethod(){}
    void setClass1DefaultMethod(){}
    protected void setClass1ProtectedMethod(){}
    public void class1PublicMethod(){}

    public void test(){
        class1Private = 1;
        class1Default =2;
        class1Protected =3;
        class1Public = 4;  //hepsini görürürüm aynı classta hepsi.
    }

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.class1Private = 1;
        c.class1Default =2 ;
        c.class1Protected = 3;
        c.class1Public = 4; //yine aynı class ta olduğu için hepsini gördü
        //fakat ben bu maini ve içindekileri class2 de yazsam bu sefer private görmez. deneyelim
        //bkz. class2
    }

    public void setClass1Private(int class1Private) {
        if(class1Private>0)
        this.class1Private = class1Private;
    }
}
