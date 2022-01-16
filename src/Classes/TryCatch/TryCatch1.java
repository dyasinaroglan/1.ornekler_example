package Classes.TryCatch;

public class TryCatch1 {
    public static void main(String[] args) {

        System.out.println("java");

        int a =4;
        int b=0;
        System.out.println(a/b);  //ArithmeticException
        //tanımsız olur.
        System.out.println("java");

    }
}



/*
    Exceptions : yakalanip kontrol edilebilen problemler

    Errors

    Compile Error
        Derleme sirasinda meydana gelen hatalar, compiler uygula calismadan bildirir
        örnek : ; unuttunuz ise
    RunTime Error
        Calisma sirasinda olusan hatalar



    ClassNotFoundException
    IOException
    SQLException
    RunTimeException (çalışma zamanı istisnası)
        ArithmeticException (aritmatik istisna)
        NullPointerException
        FormatExceptions (biçim)
        IndexOutOfBoundException
            ArrayIndexOutOfBoundException
            StringIndexOutOfBoundException

 */
