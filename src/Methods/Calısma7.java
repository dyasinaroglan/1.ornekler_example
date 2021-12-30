package Methods;

public class Calısma7 {
    public static void main(String[] args) {
        //Toplama metodu yazin, ama kac sayi olacagi bilinmiyor.
        toplam(2,56,42);
        toplam(100,200);



    }
    public static void toplam(int...sayılar) {  //kaç sayı olduğu bilinmiyor.bu şekilde 3 nokta yaptığımzıda
        //istediğimiz kadar sayı koyabiliyoruz. dizi mantığında çalışır.
        int toplam =0;

        for (int i = 0; i < sayılar.length; i++) {
            toplam= toplam+sayılar[i];

        }
        System.out.println("toplam:"+toplam);
    }

}
