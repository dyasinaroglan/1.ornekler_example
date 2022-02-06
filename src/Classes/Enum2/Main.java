package Classes.Enum2;

public class Main {
    public static void main(String[] args) {

        Book sef = Book.SEFILLER;
        Book sb = Book.SİNEKLİBAKKAL;

        sef.kitapBılgısı();
        sb.kitapBılgısı();
        System.out.println("**************");

        for (Book value : Book.values()) {
            System.out.println(value);   // value ile Book enum unun içindeki listeyi bulabiliyorum.
            
        }

    }
}
