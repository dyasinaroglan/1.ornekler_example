package Classes.Exception.TryCatch;

public class TryCatch2 {
    public static void main(String[] args) {

        int a=4;
        int b=0;

        try {
            System.out.println(a/b);
            //burada hata varsa catch e gönder.
        }catch (Exception e){
            System.out.println("bir sayı sıfıra bölünmez ");
        }



        System.out.println("1.try-catch");


        try {
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("2.try-catch");
    }
}
