package Classes.modifiers.methodsField.package4;

import Classes.modifiers.methodsField.package3.PublicClass1;

public class Main2 {
    public static void main(String[] args) {
        //farklı package main2

        PublicClass1 p = new PublicClass1();
       //  p.defaultField=3; bunları görmez
        p.publicField=4;
      //  p.privateField=5; bunları görmez

        //farklı package olduğu için defaultfield a ve farklı class olduğu için privatefield a ulaşılamaz.

        p.publicMethod();
        //sadece publicMethods'a ulaşabilirim.
       // p.defaultMethod();
        //p.privateMethod(); ULAŞAMAZ
        //Farklı package olduğu için default methoda ulaşılamaz
        //private ise sadece class içinden ulaşılabilir.
    }
}
