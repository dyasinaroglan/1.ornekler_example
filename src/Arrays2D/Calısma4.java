package Arrays2D;

public class Calısma4 {
    public static void main(String[] args) {
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double toplam = 0;

        for(int i=0; i<arr.length; i++) {
            toplam = toplam + arr[i];
        }
            double ort = toplam/arr.length;
        System.out.format("ortalama= %.2f ", ort);
    }
}
