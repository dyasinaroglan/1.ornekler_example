package Classes.Extends.extend5;

public class ChildClass extends ParentClass {

    static {
        System.out.println("ChildClass static initiazeri ");
    }
    {
        System.out.println("ChildClass ın instance initializer ı");
    }

    public ChildClass(){
        System.out.println("ParentClass ın constructorı");

    }


}
