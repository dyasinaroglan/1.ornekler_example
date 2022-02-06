package Bolum8.Classes.paket6;

public class Main6 {
    public static void main(String[] args) {


        //dikdörtgenin alanını ve çevresini hesaplayacağız.
        //fakat burada new yapmayacağız


        Dikdörtgen d1 = Dikdörtgen.getDikdörtgen(2, 3);
        System.out.println(d1.getAlan());
        System.out.println(d1.getCevre());
    }
}
