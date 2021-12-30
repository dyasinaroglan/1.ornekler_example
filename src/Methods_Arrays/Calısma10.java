package Methods_Arrays;

public class Calısma10 {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildigi ve notlarinin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */
        ortalamaBul("yasin",34,67,89,45,78);
    }
    public static void ortalamaBul(String isim,int...notlar){
        int toplam =0;

        for (int i = 0; i < notlar.length; i++) {
            toplam+= notlar[i];
        }
        int ortalama = toplam/notlar.length;
        System.out.println("öğrenci "+isim+" sınavlardan ortalama "+ortalama+" almıştır.");
    }
}
