package Bolum4.Methods;

public class MethodsExample5 {
    public static void main(String[] args) {
        /*
        öyle bir toplama metodu yazin ki kullanici 2,3 ve 4 sayinin toplamini bu metotla yapabilsin.
         */
        toplam(23,45);
        toplam(45,12,5,67);
        toplam(45,12,6);

        /*
        aynı isimde
        aynı işi yapan(toplama)
        farklı sayıda parametre alan mrtotlara overload metot denir
         */


    }
    public static void toplam(int sayı1, int sayı2){
        int toplam = sayı1+ sayı2;
        System.out.println("toplam = " + toplam);
    }
    public static void toplam (int sayı1, int sayı2, int sayı3){
        int toplam = sayı1+ sayı2+ sayı3;
        System.out.println("toplam = " + toplam);
    }
    public static void toplam (int sayı1, int sayı2, int sayı3,int sayı4){
        int toplam = sayı1+ sayı2 + sayı3 + sayı4;
        System.out.println("toplam = " + toplam);
    }
}
