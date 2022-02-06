package Bolum8.Classes.Exception;

public class Main_args {
    public static void main(String[] args) {
        int i=0;

        for (String arg : args) {
            System.out.println(++i + ":"+ arg);

            //programa dışarıdan veri aktarma. üstte run var ona tıklıyoruz. Edit configurations a tıklayıp yazabilirim
        }
        System.out.println("*******************");

        int a =1;
        int b =1;

        System.out.println(a++ +","+ ++b);
        System.out.println(a+ "," + b);
    }
}
/*
             i++ --> önce i ile ilgili işlemi yap, sonra arttır.
             ++i --> önce i arttırılır sonra i ile ilgili işlem yapılır.
 */