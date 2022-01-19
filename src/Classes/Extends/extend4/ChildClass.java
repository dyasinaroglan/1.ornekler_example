package Classes.Extends.extend4;

public class ChildClass  {

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
