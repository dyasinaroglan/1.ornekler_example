package Bolum4.Methods.UdemyEmre;

public class MetotKavramı {

    public static void main(String[] args) {
        menuYaz();
        sayılarıTopla(3,6);
        sayılarıTopla(11,11);
        topla();
        int sayı =5;
        //işlemin yapıldığı yer.

        farkBul(10,6);

    }

    public static void sayıyıDegistir(int sayı) { //sayıyıDegistir metodu int vir değer almalı.
        sayı = 10+sayı;
        System.out.println(sayı);
    }

    public static void menuYaz(){
        System.out.println("****MENÜ****");
        System.out.println("1.iki sayının toplamını bul");
        System.out.println("2.iki sayının farkını bul");
        System.out.println("3.iki sayının çarpımını bul"); //menüde değişiklik yapmak istiyorsak methodun içinde yapıcaz

    }
    public static void sayılarıTopla(int num1,int num2){ //kullanışlı olan bu. iki tane int değer bekliyorum
        //bu değerlere sen karar ver ve istediğin zaman değiştir.
        int toplam = num1+num2;
        System.out.println(toplam);

    }
    public static void topla(){
        int num1 = 5;
        int num2 =6;
        int toplam =num1+num2;
        System.out.println(toplam);
    }
    public static int farkBul (int sayı1,int sayı2){

        int fark = sayı1-sayı2;
        System.out.println(fark);
        return fark;
    }
}
