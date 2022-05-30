package algoritma;

public class _04Examp {
    public static void main(String[] args) {

        //2 tane dizideki elemanları karşılaştırarak, aynı elemanları bulan program

        int[] dizi1 = {1,2,3,4,5,6,7,56,63,76,66,82,59};
        int[] dizi2 = {1,2,3,4,12,6,7,56,63,88,32,82,67};

        int i,j;
        for (i = 0; i < dizi1.length ; i++) {
            for (j = 0; j < dizi2.length; j++) {
                if(dizi1[i] == dizi2[j]){
                    System.out.println(dizi2[j]);
                }

            }
        }
    }
}
