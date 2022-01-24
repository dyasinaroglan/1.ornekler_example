package classesExample.Antreman2;

public class Main {
    public static void main(String[] args) {
        /*
        Bir Insan class"i tanimlayin

class Insan
    static count->int;

    adi ->String
    yasi -> int
    akrabalari -> ArrayList<String>


    methodlari
    veriAta(String adi, int yasi){
        Insan.count++;
        this.adi = adi;
        this.yasi = yasi;
    }

    akrabaAta(String...adi){
            for loop ile arrayList icine atanacak
        }

    adiniSoyle()
    akrabalariniSoyle()


 Main class
    static insanSayisi();
         */

        Insan i1 = new Insan();
        i1.akrabaAta("ayşe","fatma","hayriye");
        i1.veriAta("yasin",30);
        i1.akrabalarınıSoyle();
        insanSayısı();





    }
    public static void insanSayısı (){
        System.out.println(Insan.count);
    }
}
