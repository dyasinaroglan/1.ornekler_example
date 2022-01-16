package Arrays;

public class UdemyEmre_Ornek {
    public static void main(String[] args) {
        //10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama.


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
           array[i] = i*i;
           // ya da
           // array[i]= (int) Math.pow(i,2);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("elemanlar= "+ array[i]);

        }
    }
}
