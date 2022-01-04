package Classes.paket5;

public class Main5 {
    //dikdörgenin alanı ve çevresini hesaplayacağız.
    //ama burada new kullanılmayacak

    public static void main(String[] args) {
        //NEW burada yapmadan nesneyi nasıl oluştururum soru bu???

        Dikdörtgen d1 = Dikdörtgen.getDikdörtgen(2,3); //Dikdörtgenin altındaki getDikdörtgenden çağırıyorum.
        //getDikdörtgen static in altında buna static bir method yazmalıyım.Dikdörtgen bir return etmesi lazım.
        System.out.println(d1.getAlan());
        System.out.println(d1.getCevre());
        }

    }

    //NESNE MUTLAKA BİR YERDE NEW YAPACAK

