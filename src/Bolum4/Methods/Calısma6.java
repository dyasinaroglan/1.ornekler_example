package Bolum4.Methods;

public class Calısma6 {
    public static void main(String[] args) {
        /*
        2 sayinin toplamini bulan method yazin.
         */
        parametreliToplam(2,5);
        parametresizToplam();
        returntopla(5,5);
        returnparametresiztopla();




    }
    public static void parametreliToplam(int x, int y){
        int toplam = x+y;
        System.out.println("toplam:"+toplam);
    }
    public static void parametresizToplam(){
        int x = 56;
        int y=4;

        System.out.println("toplam:"+(x+y));
    }
    public static int returntopla (int x, int y){
        int toplam =x+y;
        System.out.println("toplam="+toplam);
        return toplam;
    }
    public static int returnparametresiztopla (){
        int x =3;
        int y=4;
        int toplam =x+y;
        System.out.println("toplam="+toplam);
        return toplam;

    }
}
