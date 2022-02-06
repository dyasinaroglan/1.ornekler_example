package Bolum4.Arrays;

public class UdemyEmre_Ornek3 {
    public static void main(String[] args) {

        int[] sayılar ={1,2,3};

        System.out.println("dizi değerlerini arttırmadan önce = ");
        diziGöster(sayılar);
        System.out.println();

        System.out.println("index değerlerini arttırdıktan sonra = ");
        indexDeğerleriArttır(sayılar);
        diziGöster(sayılar);
        System.out.println();
        toplamBul(5,7);
        toplamBul(5,7,12);
        toplamBul(4,6,12,89,45,78,4);

    }
    public static void indexDeğerleriArttır(int[] sayılar){
        sayılar[0]++;
        sayılar[1]++;
        sayılar[2]++;
    }
    public static void diziGöster(int[] sayılar){
        for (int i : sayılar) {
            System.out.print(i+" ");

        }
    }
    public static void toplamBul(int num1,int num2){
        int toplam = num1+num2;
        System.out.println("toplam=" + toplam);
    }
    public static void toplamBul(int num1, int num2, int num3){
        int toplam = num1+num2+num3;
        System.out.println("toplam = "+ toplam); //aynı isimde farklı bir method.
    }
    public static void toplamBul(int...sayılar){  //4,6,12,89,45,78,4
        int toplam =0;
        for (int i : sayılar) {
            toplam+= i;
        }
        System.out.println("toplam...= "+ toplam);
    }
}
