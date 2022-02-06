package Classes.Abstract3;

public abstract class AbstractClass {

    public abstract void ekranaYaz(String str);  // gövdesi yok yani noktalı virgülle bitiyor

    /*
    gövdesi olmayan metotlara abstract methot denir. sadece isim ve parametre tanımlamaları olur.
    bir class ın en az bir methodu abstract ise CLASS abstract classtır.

     */
    //ekstradan abstract methot yazabiliriz.

    public void islemYap(int n){
        System.out.println(n*n); //abstract class ların içinde normal methotlar da olabilir.

    }
}
