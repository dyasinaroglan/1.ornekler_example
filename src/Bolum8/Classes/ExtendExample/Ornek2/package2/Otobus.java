package Bolum8.Classes.ExtendExample.Ornek2.package2;

import Bolum8.Classes.ExtendExample.Ornek2.package1.Arac;

public class Otobus extends Arac {

    public void method1(){
        protectedVar ="100";
        publicVar ="245"; //farklı package larda ama extend edğidiği için görülür.

        //fakat private ve default a farklı package lardan ulaşamayız.

        publicMethod();
        protectedMethod(); //extend edildiği için
        //privateMethod ve defaultMethod a ulaşamam.farklı package larda



    }
}
