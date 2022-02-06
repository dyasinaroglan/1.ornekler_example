package Bolum8.Classes.modifiers.methodsField.package3;

public class PublicClass1 {
    //fields, attributes

    public int publicField;  //her yerden ulaşılabilir.
    int defaultField;        //aynı package içinden ulaşılabilir
    private int privateField;  //aynı class içinde görülebilir

    //methods
    public void publicMethod(){ //class a ulaşan herkes tarafından görülür.
          //her yerden ulaşılır.
    }
    //package içinden ulaşılabilir
    void defaultMethod(){

    }
    //sadece class içinden ulaşılabilir.
    private void privateMethod(){

    }

    public static void main(String[] args) {
        PublicClass1 p = new PublicClass1();
        //burada p. yaptığımızda üçü de çıkıcak. private da olacak
        p.defaultField=3;
        p.publicField=4;
        p.privateField=5; //aynı class da olduğu için private'e ulaşabiliriz.


        p.defaultMethod();
        p.publicMethod();
        p.privateMethod(); //hepsine ulaşabilirim
    }

}