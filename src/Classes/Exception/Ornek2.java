package Classes.Exception;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tamam = false;

        while (!tamam){
           try {
               System.out.println("1.sayıyı giriniz");
               int sayı1 = scanner.nextInt();
               System.out.println("2.sayıyı giriniz");
               int sayı2 = scanner.nextInt();
               System.out.println("ilk girilen sayının karesi = "+ karesi(sayı1));
               System.out.println("ikinci girilen sayının karesi = "+karesi(sayı2));
               tamam = true; // tamam artık true oldu. döngünün içine bir daha girmez.

           }catch (Exception e){
               System.out.println("integer değer girmelisini");
               scanner.nextLine();
           }
        }
    }
    public static int karesi(int i){
       return i*i;
    }
}
