package Bolum2.Sorular;

public class Example5 {
    public static void main(String[] args) {
        //1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız.

        int toplam = 0;


        for (int i = 0; i < 100; i++) {
            toplam+= i;
        }
        System.out.println("toplam = "+ toplam);
    }
}
