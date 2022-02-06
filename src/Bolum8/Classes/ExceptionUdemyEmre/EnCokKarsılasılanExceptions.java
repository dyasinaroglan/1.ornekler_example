package Bolum8.Classes.ExceptionUdemyEmre;

public class EnCokKarsılasılanExceptions {
    //NullPointException
    public static void main(String[] args) {

        //NullPointException--> henüz değer vermeden onu kullanmaya çalışmak.
        /*String isim;
        System.out.println(test.isim.length()); //bu NullPointException

         */

        // ArrayIndexOutOfBoundsException-->
        try {
            int[] sayılar ={1,2,4};
            System.out.println(sayılar[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+ " olmayan indis sayısı");
        }
        // NumberFormatException
        try {
            int sayı1 = Integer.parseInt("123");
            int sayı2 = Integer.parseInt("AB23"); // BUNU İNT E ÇEVİRMEK MÜMKÜN DEĞİL.
        }catch (Exception e){
            System.out.println(e);
        }
        // s<ClassNotFoundException
        try {
            Class.forName("YASİN");
        } catch (ClassNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("program buradan devamm");
    }

    }
class test{
    static String isim;
}