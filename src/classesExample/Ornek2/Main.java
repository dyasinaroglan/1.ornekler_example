package classesExample.Ornek2;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan("YASİN");
        Insan i2 = new Insan("MEHMET");
        Insan i3 = new Insan("SELÇUK");
        Insan i4 = new Insan("KAZIM");
        Insan i5 = new Insan("ASLI");

        i1.arkadasEkle(i2);
        i3.arkadasEkle(i4);
        i5.arkadasEkle(i1);

        i1.sohbetEt(i2);
        i1.neYapıyorsun();
        i3.neYapıyorsun();
        i4.sohbetEt(i2);
        i5.sohbetEt(i1);
        i1.sohbetiKes();
        i3.sohbetiKes();



        }
}
