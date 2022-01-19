package Classes.Extends.extend4;

public class Main {

    static {
        System.out.println("main static initilaizer");
    }
    public static void main(String[] args) {
        System.out.println("main başladı");
        ChildClass c = new ChildClass();
        System.out.println("main bitti");
    }
}
/*
extend etmeden önce yaparsak--> ilk başta main static initilazir okudu.
                                sonra main başladı.
                                ChildClass a ait static initilazir okudu.
                                sonra ChildClass a ait instance initilaizeri okudu.
                                ve ChildClass ın constructorunu okudu.
                                ve en son main bitti dedi.
 */