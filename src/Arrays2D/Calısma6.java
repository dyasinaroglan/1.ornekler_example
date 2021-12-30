package Arrays2D;

public class Calısma6 {
    public static void main(String[] args) {
        //10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama

        int[] sayılar = new int[10];

        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i] = i*i;
            //yada
            //sayılar[i] = (int)Math.pow(i,2); şeklinde yapabiliriz.

        }
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("eleman:"+sayılar[i]); //sayılar dizisinin o andaki indisini yazdır

        }
    }
}
