package Arrays2D;

public class Calısma5 {
    public static void main(String[] args) {
        //tüm ögeleri toplama

        int[] dizi ={23,45,2,56,7};
        int toplam =0;

        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        System.out.println("toplam="+toplam);
    }
}
