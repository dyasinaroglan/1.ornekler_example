package Classes.Extends.extend6;

public class Main {

    static {
        System.out.println("main in static initiaziri");
    }

    public static void main(String[] args) {
        System.out.println("main başladı.");

        Bilgisayar b =  new Bilgisayar();

        System.out.println("main bitti.");
        {
            System.out.println("main in instance initiliaziri");
        }
    }


}
