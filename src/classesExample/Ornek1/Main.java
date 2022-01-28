package classesExample.Ornek1;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan("ALİ");
        Insan i2 = new Insan("VELİ");
        Insan i3 = new Insan("HASAN",i1,i2);
        Insan i4 = new Insan("HÜSEYİN");
        Insan i5 = new Insan("MEHMET");


       i1.arkadasEkle(i2);
       i1.arkadasEkle(i5);
       i3.arkadasEkle(i4);

       i1.sohbetEt(i3);
       i1.sohbetEt(i5);
       i1.neYapıyorsun();
       i1.sohbetEt(i2);
       i1.neYapıyorsun();
       i2.neYapıyorsun();
       i3.neYapıyorsun();
       i4.neYapıyorsun();


    }
}
