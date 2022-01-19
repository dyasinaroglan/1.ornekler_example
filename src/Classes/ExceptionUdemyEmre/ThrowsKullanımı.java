package Classes.ExceptionUdemyEmre;

public class ThrowsKullanımı {
    public static void main(String[] args) {

    try {
        methot3();
    }catch (NumberFormatException e){
        System.out.println("hata yakalandı");
    }

    }
    private static void methot() throws NumberFormatException {

        Integer sayı = Integer.parseInt("abc"); //bu hata verir.
    }
    private static void methot2()throws NumberFormatException {
        methot();
    }
    private static void methot3() throws NumberFormatException {
        methot2();
    }
}