package Classes.ExtendExample.Ornek2.package1;

public class Otomobil extends Arac {

    public void method1(){
        protectedVar = "1";  //extend edildiyse farklı package larda bile görünür.
        publicVar ="2";   //her yerden görür
        defaultVar ="3";  //
        //privateVar = 4;  //bunu görmez. ulaşılamaz.

        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod(); bunu görmez. sadece aynı sınıflarda
    }


}
