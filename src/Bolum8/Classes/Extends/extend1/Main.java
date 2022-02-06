package Bolum8.Classes.Extends.extend1;

public class Main {
    public static void main(String[] args) {

        Hayvan hayvan = new  Hayvan();

        Kopek köpek = new Kopek();
        köpek.cins =" sivas kangalı"; //normalde köpeğin özelliklerinden sadece cinsi yazılıydı.
        //fakat extend yöntemiyle hayvan daki ortak özellikleri köğeğe geçirmiş olduk.

        Kedı kedi = new Kedı();
        kedi.isim ="tarçın";
        System.out.println(kedi.isim);
        kedi.miyavla();
        kedi.yemekYe();
        köpek.yemekYe();
    }
}
