package Classes.Exception;

public class UnCheckedException {
    public static void main(String[] args) {
        /*
        unchecked exception--> compiler in kontrol etmediği exceptionlar.
         */
        int a =5;
        int b =0;

        System.out.println(a/b); //Unchecked hatalar. ama noktalı virgülün olmaması compiler hatasıdır.

    }
    public int num(){
        return 1;
       // System.out.println("sdssdfsd"); compiler hatası. returndan sonra hiçbir şey çalışmaz.
        //daha çalıştırmadan çıkan hatalar compiler hatalar
        //çalıştırdıktan sonra çıkan hatalar runTime hatalarıdır.

        /*
        AYRICAA
        1.checked exceptions : compiler in kontrol ettiği hatalar.
        2.unchecked exceptions : compiler in kontrol edemediği hatalar.

        bunların hepsi runTime hatalarda ortaya çıkıyor.
         */
    }
}
