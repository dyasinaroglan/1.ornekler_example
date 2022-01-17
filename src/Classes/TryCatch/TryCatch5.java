package Classes.TryCatch;

public class TryCatch5 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            bekle(1); //i yi yazdır he defasında bir saniye bekle. method yardımıyla da yapabiliriz.

        }

        System.out.println(1);
        try {
            Thread.sleep(3000);  //1 den sonra 2 yi yazmak için 3 saniye bekletiyoruz. //thread.sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(2); //1 ile 2 arasında bekleme yapabilir miyim?


    }
    public static void bekle(long milis){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
