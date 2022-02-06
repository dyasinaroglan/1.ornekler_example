package Bolum8.Classes.Enum1;

public class Main {
    public static void main(String[] args) {
        int a = 1;

        Enum1 e ;
        e = Enum1.CHROME;

        driver1("Chrome"); //bilinmeyen yazacak neden çünkü büyük harfle
        driver2(Enum1.CHROME); //ENUM olunca yazım hatası yapma ihtimalim olmuyor.işleri kolaylaştırıyor.

    }
    public static void driver1 (String driver){
        switch (driver){
            case "chrome" :
                System.out.println("Chrome");
            case "firefox" :
                System.out.println("Firefox");
            default:
                System.out.println("bilinmeyen driver");
        }

    }
    public static void driver2 (Enum1 driver){
        switch (driver){
            case CHROME :
                System.out.println("Chrome");
            case FİREFOX:
                System.out.println("Firefox");
            default:
                System.out.println("bilinmeyen driver");
        }

    }
}
