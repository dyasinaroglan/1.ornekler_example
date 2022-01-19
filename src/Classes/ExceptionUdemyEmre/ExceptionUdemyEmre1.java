package Classes.ExceptionUdemyEmre;

public class ExceptionUdemyEmre1 {
    public static void main(String[] args) {

        try {
            Object o1 = new Object();
            String a = (String) o1; //object bir değeri stringe çeviremem.
        }catch (Exception e){
            System.out.println("hataa\n"+ e.toString());
        }finally {
            System.out.println("finally çalıştırıldı.");
            System.out.println("kod a buradan deavm et.");
            //finally ne demek try i dene hata çıkarsa catche geç hata çıksa da çıkmasada finally den devam et.


        }
    }
}
