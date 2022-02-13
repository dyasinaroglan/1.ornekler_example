package Bolum4.Methods_Arrays;

public class Calısma9 {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildigi ve notlarinin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */
        notlarTablosu("yasin",67,89,67,54,100);
    }
    public static void notlarTablosu(String name,int...notlar){
        int toplamNot =0;
        for (int i = 0; i < notlar.length; i++) {
           toplamNot+=notlar[i];
        }
        int ort =toplamNot/notlar.length;
        System.out.println("öğrenci "+name+" sınavlardan ortalama "+ort+" sonucunu almıştır");
    }
}
