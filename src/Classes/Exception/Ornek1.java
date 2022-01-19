package Classes.Exception;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        /*kullanıcıdan bir cümle alın bu cümleyi string builder a ekleyin.
        sonra kullanıcıdan ayrı bir kelime ve hangi indexden itibaren ekleneceğini alın.
        bu kelimeyi istenilen indexten itibaren ekleyin ve ekrana yazdırın.

         */

        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();  //hata çıkabilir.
            System.out.println("girilen ilk sayı : "+ a);
            int b = scanner.nextInt();
            System.out.println("girilen ikinci sayı");
            System.out.println("ilk sayının karesi : "+ karesi(a));
            System.out.println("ikinci sayının karesi : "+ karesi(b));
        }catch (Exception e){
            System.out.println("ınteger girmelisiniz");  //hata gördüğün yerde catch e atla.
        }
    }
    public static int karesi(int i){
        return i*i;
    }
}
