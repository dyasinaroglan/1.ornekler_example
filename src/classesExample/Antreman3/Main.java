package classesExample.Antreman3;

public class Main {
    public static void main(String[] args) {
        /*
        Insan classi olusturun

    String adi;
    baba
    anne

    methodlar

    adAta(String)
    babaAta()
    anneAta()

    adinNe()
    babninAdiNe()
    anneninAdiNe()

         */

        Insan i1 = new Insan();
        i1.veriAta("yasin",30);

        Insan i2 = new Insan();
        i2.veriAta("fatma",60);

        Insan i3 = new Insan();
        i3.veriAta("hakkı",65);

        Insan i4 = new Insan();
        i4.veriAta("durmnuş",80);

        i1.anneAta(i2);
        i1.babaAta(i3);
        i3.babaAta(i4);

        i1.senKımsın();
        i2.senKımsın();
        i1.babanKim();
        i1.annenKim();



    }
}
