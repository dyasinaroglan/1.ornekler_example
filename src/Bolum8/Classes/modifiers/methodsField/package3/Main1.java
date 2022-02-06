package Bolum8.Classes.modifiers.methodsField.package3;

public class Main1 {
    public static void main(String[] args) {

        PublicClass1 p = new PublicClass1();
        p.publicField =12;
        p.defaultField=6;

        //privatefield ı görmez aynı class da değil.

        p.publicMethod();
        p.defaultMethod();
       // p.privateMethod();  görünmezz.aynı class da olması lazım
           //class dışından ulaşılamaz.
    }
}
