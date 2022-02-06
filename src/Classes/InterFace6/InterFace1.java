package Classes.InterFace6;

public interface InterFace1 {
    // fieldler public,static finaldır. initiliaze etmem lazım
    //String name; bu şekilde hata verir.
    String name = "1";

    // public void islem(){  hata verir

    void islem(); //default methot
    //ınterFace in methotları da abstractır. yazmamıza gerek yoktur. gövde yoktur.

    /*InterFace methotlar nasıldı? gövde yazamıyorduk. ancak default bir methot tanımlarsak gövde de yazabiliriz.


     */
    default void islem2(){
        System.out.println("default islem 2"); //InterFace deki default farklı. InterFace de gövdesini yazabildiğimiz
        //methotlar default methotlardır.
    }


}
