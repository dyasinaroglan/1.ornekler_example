package Classes.ObjectOrientedTekrar.Paket8;

public class Main {
    public static void main(String[] args) {

        Class1 class1 = new Class1(12,"AHMET",12);
        Class1 class2 = new Class1(); //BOŞ constructor olduğu için içini doldurmadan da yazabilirim. hata vermez

        System.out.println(class1); // class1 in aslında toString methodu yok.
        //fakat Parent in olduğu için ve extend edildiği için Parent da bulunan toString methodunu yazdırır.

        //Class1 in kendi toString methodu varsa eğer kendi methodunu yazdırır öncelikle

    }
}
