package Bolum8.Classes.Abstract1;

    //methotlarından biri abstract olan class da abstract olarak belirlenmeli.
    //abstract class lardan da interFace'ler gibi nesne oluşturulmaz.
    //abstract class ları extend eden class lar bu class a ait abstract methotları override etmeli.

     //constructor ekleyemem. constructor oluştturmam demem nesne oluşturmak anlamına gelir.
     //nesne oluşturamadığım için de constructor da oluşturamam. Abstract class larda.

public abstract class AbstractClass {

    //gövdesiz methot tanımlarsam abstract ifadesi kullanmalıyım.

    abstract void abstractMethod();

    //normal methotlarda olabilir. ancak methotların bir tanesi abstract ise class da abstract olmalıdır.
    public void say(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i+",");

        }
    }
}
