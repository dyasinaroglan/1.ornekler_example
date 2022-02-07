package Bolum4.Arrays;

public class ArraysExample13 {
    public static void main(String[] args) {
        /*
        10 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
        rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
        elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
        tane eleman olduğunu yazdırın.
         */
        int[] sayılar = new int[10];
        int toplam=0;
        int count = 0;


        for (int i = 0; i < sayılar.length; i++) {
            int randomSayı = (int) (Math.random()*10+1);
            sayılar[i] = randomSayı;
            toplam+= randomSayı;
            int ortalama = toplam/sayılar.length;
            if(sayılar[i]>ortalama){
                count++;
            }
        }
        double ortalama = (double) toplam/sayılar.length;
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamayı geçen sayıların miktarı : " + count);


    }
}
