package Classes.Extends.extend4;

public class ParentClass {

    static {
        System.out.println("ParentClass static initiazeri ");
    }
    {
        System.out.println("ParentClass ın instance initializer ı");
    }

    public ParentClass(){
        System.out.println("ParentClass ın constructorı");

    }
}
