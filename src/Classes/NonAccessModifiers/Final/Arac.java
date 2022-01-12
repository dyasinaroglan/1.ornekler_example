package Classes.NonAccessModifiers.Final;

public class Arac {
    /*
    NOT: final tanımlı değişkenler sadece ilk tanımlamada,constructor da ve initializer da initialize(deger atanabilir) edilebilir.
     */


    int a;
    static int b;
    final int c = 1;    // final ilk tanimlamada initialize edildi
    final int d;        // final initializer"da initialize edildi
    final int e;

    {
        d=1;  //final i intializer da da initialize edebiliyoruz.
    }

    public Arac(int e) {
        this.e = e;  //final i constructor da initialize ettik,değer atadık.
    }
    public void method(){
      //  c=2;
       // e=10;  diyemem,hata verir. çünkü final methodun içerisinde tekrar tanımlanamaz.

    }

    public static void main(String[] args) {
        Arac a1 =new Arac(5);

    }
    public final void m1(int a){
        //final methodlar override edilemezler.

    }

    @Override
    public String toString() {
        return "Arac" +
                "a=" + a +
                "c=" + c +
                "d=" + d +
                "e=" + e ;
    }
}
