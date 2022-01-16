package Arrays;

public class UdemyEmreDiziKopyalama {
    public static void main(String[] args) {

        int[] gercekDizi = {1,7,9,12};
        int[] kopyaDizi = new int[gercekDizi.length];

        for (int i = 0; i < gercekDizi.length; i++) {
            kopyaDizi[i]=gercekDizi[i];
        }
        for (int i : kopyaDizi) {
            System.out.println("kopya dizinin elemanları = "+i);
        }

        int[] kopyaDizi2 = new int[gercekDizi.length];
        System.arraycopy(gercekDizi,0,kopyaDizi2,0,gercekDizi.length);
        diziYazdır(kopyaDizi2);
        System.out.println();
        System.out.println("***************************");
        int[] denemeDizi = new int[gercekDizi.length];
        denemeDizi = gercekDizi;
        diziYazdır(denemeDizi);
        System.out.println("*****************");
        System.out.println();
        diziYazdır(gercekDizi);
        System.out.println();
        gercekDizi[0]=100; // ana dizideki o indisteki elemanı 100 ile değiştirdim.
        diziYazdır(gercekDizi);
        System.out.println();
        tersYazdır(gercekDizi);
    }
    public static void diziYazdır(int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    public static void tersYazdır(int[] sayı){
        for (int i = sayı.length-1; i >=0; i--) {
            System.out.print(sayı[i]+" ");


        }
    }
}
