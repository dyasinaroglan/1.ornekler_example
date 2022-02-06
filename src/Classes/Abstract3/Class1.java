package Classes.Abstract3;

public class Class1 extends AbstractClass{


    public static void main(String[] args) {

        Class1 c = new Class1();
        c.ekranaYaz("java");
    }

    @Override
    public void ekranaYaz(String str) {
        System.out.println("class 1 : " + str);

    }
}

/*
abstract classlar extend edildiği zaman o abstract methot child sınıfında kesinlikle extend edilmelidir.
 */
