package Bolum8.Classes.FinalTanımlama;

public class ClassPublic extends ClassParent {

    @Override
    public void methodPublic() {
        super.methodPublic();  //SADECE public method çıktı

        //çünkü final method override edilemez.

    }
}
