package Classes.ExceptionUdemyEmre;

public class DegerDondurenBloklar {
    public static void main(String[] args) {

        System.out.println(degerDondur());


    }
    private static String degerDondur(){

        String str = "merhaba";
        try {
            str = str+" try";
          //  return str;
        }catch (Exception e){
            str = str+" catch";
            //return str;
        }finally {
            str = str+" finally";
            return str;     //hepsinde ayrı ayrı return etmeli. fakat try ve catch deki returnları silersekte program çalışır.
            //çünkü hata varsa da yoksa da finally çalışacak dolayısıyla sadece finally de de return yapsak program aynı şekilde çalışır.
        }
    }
}
