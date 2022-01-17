package Classes.TryCatch;

public class TryCatch3 {
    public static void main(String[] args) {

        String str = "java";

       // System.out.println(str.charAt(100)); //str nin 100. karakterini yaz. var mı 100. karakter yok
        //hata vericek


        try {
            System.out.println(str.charAt(100));  //dene, hata varsa catch e gönder,yakalasın.
        }catch (StringIndexOutOfBoundsException e){  //RunTimeException da olur
            System.out.println(str.charAt(str.length()-1)); //hatayı bulduktan sonra diyorum ki str nin son karakterini yazdırsın.
        }
        try {
            System.out.println(str.charAt(100));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(str.charAt(str.length()-1));  //array hatası varsa yakala ve yazdır
            //fakat str array olmadığı için catch e inecek fakat array olmadığını görecek ve hata verip programı sonlandırıcak.
        }
        //UYGUN OLMAYAN bir EXCEPTİON hata vermek programı sonlandırır. uygun hatayı yazmak lazım. fakat bütün hatalarda yazabileceğimiz
        // Exception var. bunu yazarsak her hataya olur.

    }
}
