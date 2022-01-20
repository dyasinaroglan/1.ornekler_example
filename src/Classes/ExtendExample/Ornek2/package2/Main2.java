package Classes.ExtendExample.Ornek2.package2;

import Classes.ExtendExample.Ornek2.package1.Otomobil;

public class Main2 {
    public static void main(String[] args) {
        Otomobil o = new Otomobil();
        o.publicVar ="654";
        o.publicMethod();

        //method olduğunda eğer classlae extend edildiyse farklı packaage lardan ulaşabiliyorum.
        //fakat direkt class ın içinde bir nesne oluşturduğumuzda extend etsek bile protectede ulaşamayız.

    }
}
