package Methods;

public class Calısma4 {
    public static void main(String[] args) {
        /*
        6 elemanli bir sayi dizisi olusturun ve bu dizideki tek ve cift eleman
        sayisini bulan bir metot yazin.
         */
        int[] array ={12,6,45,89,4,13};
        elemanSayısı(array);

    }
    public static void elemanSayısı (int[] dizi){

       int tekMiktar =0;
       int ciftMiktar =0;

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==1){
                tekMiktar++;
            }
            else {
                ciftMiktar++;
            }
        }
        System.out.println("tek sayı adedi:"+tekMiktar);
        System.out.println("çift sayı adedi:"+ciftMiktar);
    }
}
