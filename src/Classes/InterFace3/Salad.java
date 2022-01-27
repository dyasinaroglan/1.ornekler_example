package Classes.InterFace3;

public abstract class Salad extends Food {

    public Salad(String name) {
        super(name);
    }

    @Override
    public void taste() {
        System.out.println("yeşil beslenme");
    }
}
