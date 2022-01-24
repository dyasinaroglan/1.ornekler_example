package Bolum2;

public class ornek1 {
    public static void main(String[] args) {
        String str = "java Nasıl";

        int ilkA = str.indexOf("a");
        System.out.println(ilkA);
        int ikinciA = str.indexOf("a",ilkA+1);
        System.out.println(ikinciA);
        int ücüncüA = str.indexOf("a",ikinciA+1);
        System.out.println(ücüncüA);
    }
}
