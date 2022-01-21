package Bolum1;

public class StringMethotlar {
    public static void main(String[] args) {

        // Isminizin ilk harfi ile son harfi ayni mi?

        String isim = "YASİN";
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(4);

        boolean aynıMı = ilkHarf == sonHarf;
        boolean aynıMıDegılMı = ilkHarf != sonHarf;

        System.out.println(aynıMı);
        System.out.println(aynıMıDegılMı);

        //Isminizin son harfini yazdirin.

        String name = "yasin";

        char sonHarf1 = name.charAt(name.length()-1);
        System.out.println(sonHarf1);

        String cümle ="bugün hava";
        String tamCumle = cümle.concat(" çok güzel");
        System.out.println(tamCumle);
        System.out.println(tamCumle.indexOf("gü")); //index numarasını verir.

        // Bir 5 kelimelik bir cümle yazin ve bu cümle icerisinde
        // ki son kelimeyi yazdirin.

        String cümle1 = "mehmet sinemaya ve müzeleri gezmiş";
        int cümleSonu = cümle1.length();

        int cümleBaslangıc = cümle1.indexOf("g");
        System.out.println(cümle1.substring(cümleBaslangıc,cümleSonu));
        System.out.println(cümle1.substring(cümleBaslangıc));
    }
}
