package Bolum8.Classes.InterFace3;

public class CheeseCake extends Sweet{
    public CheeseCake(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("USA");
    }
}
