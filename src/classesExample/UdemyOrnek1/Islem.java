package classesExample.UdemyOrnek1;

public class Islem {

    public static int topla(int...sayılar) {
        int toplam = 0;
        for (int i = 0; i < sayılar.length; i++) {
            toplam+=sayılar[i];
        }
        return toplam;

    }
    public int cıkar (int...sayılar) {
        int fark = sayılar[0];
        for (int i = 1; i < sayılar.length; i++) {
            fark=fark-sayılar[i];
        }
        return fark;
    }
    public int carp(int...sayılar){
        int carpım =sayılar[0];                            // 1   2   3 i
        for (int i = 1; i <sayılar.length ; i++) { //2   4   5 sayılar
            carpım=sayılar[i]*carpım;
        }
        return carpım;
    }
    public double böl(double...sayılar) {
        double bolum = sayılar[0];
        for (int i = 1; i < sayılar.length; i++) {
            if (sayılar[i] != 0) {
                bolum = bolum / sayılar[i];
            } else {
                System.out.println("TANIMSIZ");
            }

        }
        return bolum;
    }

}
