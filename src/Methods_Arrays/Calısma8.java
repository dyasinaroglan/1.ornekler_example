package Methods_Arrays;

public class Calısma8 {
    public static void main(String[] args) {
        /*
        Faktoriyel hesaplayan bir metot yazin.
        5! -> 5*4*3*2*1 = 120
         */
        hesapla(7);
    }
    public static int hesapla(int num){
        int faktöriyel =1;
        for (int i = 1; i <=num ; i++) {
           faktöriyel *= i;

        }
        System.out.println("sonuc:"+faktöriyel);
        return faktöriyel;
    }
}
