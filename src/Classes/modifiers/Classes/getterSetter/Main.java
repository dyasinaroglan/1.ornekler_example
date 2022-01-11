package Classes.modifiers.Classes.getterSetter;

public class Main {
    public static void main(String[] args) {
        Banka b1 = new Banka(1,"A",-100);  //constructor olduğunda bu şekilde yazarız
        System.out.println(b1.getSubeNo());
        System.out.println(b1.getBakiye()); //-100 de versen bakiyeyi açmaz.
        b1.paraYatır(1000);
        b1.paraCek(500);
        System.out.println(b1.getBakiye());

    }
}
