package Bolum4.Arrays;

public class ArrayExample14 {
    public static void main(String[] args) {
        /*
        iskambil destesini diziler ile oluşturun. sonrasında bu destedeki elemanları
        karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini ekrana yazdırın.
        52 kart-->kupa,maça,karo ve sinek  as---1.2.3.4.5.6.7.8.9   joker--- kız--- papaz---
         */
        String[] kartTurler = {"kupa","maça","karo","sinek"};
        String[] kartNumaraları = {"As","2","3","4","5","6","7","8","9","10","j","q","k"};

        int[] deste = new int[52];
        desteOlustur(deste);
        desteyiKarıstır(deste);
        desteyiGoster(deste,kartTurler,kartNumaraları);
        desteyiKarıstır(deste);


    }
    public static void desteOlustur(int[] deste){
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
    }
    public static void desteyiGoster(int[] deste, String[] kartTurler, String[] kartNumaraları){
        for (int i = 0; i < 4; i++) { //ilk 4 kartı görmek istediğimiz için.
            String kartTuru = kartTurler[deste[i]/13];
            String kartNumara = kartNumaraları[deste[i]%13];
            System.out.println(kartTuru + " " + kartNumara);
        }
    }
    public static void desteyiKarıstır(int[] deste){
        for (int i = 0; i < deste.length; i++) {
            int randomDeste = (int) (Math.random()*deste.length);
            int gecici = deste[i];
            deste[i] = deste[randomDeste];
            deste[randomDeste] = gecici;
            
        }
    }
}
