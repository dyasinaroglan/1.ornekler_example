package Bolum1;

public class Odevler1 {
    public static void main(String[] args) {
       /* 1. Bir String değişkeni tanımlayın. Değişkenın degerine (mesela: Ali)göre
        consola "Selam Ali!" yazdıracak.

        */
        String str = "selam Ali";

       /* Verilen bir String değerinin ilk yarısını ekrana yazdırınız. String str =
          “Java”; Çıktı : Ja

        */

        String str1 = "java";
        String ilkKısım = str1.substring(0,2);
        System.out.println(ilkKısım);

        /*Verilen bir String değerinin ikinci yarısını ekrana yazdırınız. String str
              = “Java”; Çıktı : va
         */
        String ikinciKısım = str1.substring(2);
        System.out.println(ikinciKısım);

       /* Verilen bir String değerinin ilk ve son harflerini ekrana yazdırın. String
        str = “Java”; Çıktı : Ja

        */

        String str2 = "galatasaray";
        char ilkHarf = str2.charAt(0);
        char sonHarf = str2.charAt(str2.length()-1);

        System.out.println(ilkHarf+","+ sonHarf);

       /* Bir String tanımlayın. Tüm metin kücük harflerden oluşsun. Bulmanız gereken
        ilk harfin son geçtiği indexi bulmak String str = “bilgisayar budur”; ilk harf
        “b” olduğundan en son bulunan “b” nin indexini consola yazdırınız.

        */

        String string = "bilgisayar budur";
       int bosluk = string.indexOf(" ");
       String ilKelime = string.substring(0,bosluk);
       String sonKelime = string.substring(bosluk+1);


       /* 6. Girilen metnin ilk ve son harflerinin yerlerini değiştirip yeni bir string
        oluşturup ekrana yazınız String str = “Java”; Çıktı : aavJ

        */

        String kelime = "java";
       char j = kelime.charAt(0);
       char a = kelime.charAt(kelime.length()-1);
       String ortaDeger = kelime.substring(1,kelime.length()-1);
        System.out.println(a+ortaDeger+j);



        /*7. Girilen metnin ilk yarısı ile ikinci yarısının yerlerini değiştirerek yeni
        bir string oluşturup ekrana yazınız

         */
        String metin = "java nasıl";

        int bosluk1 = metin.indexOf(" ");

        String ilkKısım1 = metin.substring(0,bosluk1);
        String ikinciKısım1 = metin.substring(bosluk1+1);

        System.out.println(ikinciKısım1+" "+ ilkKısım1);






    }
}
