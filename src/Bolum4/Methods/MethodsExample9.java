package Bolum4.Methods;

public class MethodsExample9 {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildigi ve notlarinin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */

        ortBul("yasin",45,67,98,59);
        ortBul("mehmet", 56,71,45,77);


    }
    public static void ortBul(String name, int...notlar){

        int toplamNot = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplamNot+=notlar[i];
        }
        int ort = toplamNot/notlar.length;
        System.out.println(name + " adlı öğrencinin not ortalaması = " + ort );
    }
}
