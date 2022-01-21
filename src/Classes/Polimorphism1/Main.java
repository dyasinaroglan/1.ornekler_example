package Classes.Polimorphism1;

public class Main {

    public static void main(String[] args) {
        Calısan calısan = new Calısan("ALİ",1000);
        Ogrenci ogrenci = new Ogrenci("VELİ","EGE ÜNİVERİSTESİ");

        //ÜST ÇATIDAN BİR İNSAN TANIMLICAM--alt çatıdakiler de insan değil mi?
        //işte bunun adı Polimorphism
        Insan calısan1 = new Calısan("MEHMET",1000);
        Insan ogrenci1 = new Ogrenci("YASİN","DOKUZ EYLÜL ÜNİVERİSTESİ");
        //sonucta insan bu class ların parent i değil mi? evet. hepsini kapsıyor extend edilmiş.
        //dolayısıyla Insan classında Calısan ve Ogrenci new edebilirim.

        //javaya insan ayır diyorum ama öğrenci türünden olacak diyorum ya da calısan türünden.
        System.out.println(ogrenci);
        System.out.println(calısan);
        insanBilgisi(calısan1);
        insanBilgisi(ogrenci1);  //tek methotla birden fazla işlem yapabiliyoruz.
    }

    public static void isimYaz(){

    }
    public static void insanBilgisi (Insan insan){
        System.out.println(insan);
    }
    public static void ogrenciBilgisi(Ogrenci calısan){
        System.out.println(calısan);

    }
    public static void calısanBilgisi(Calısan ogrenci){
        System.out.println(ogrenci);
    }

}
