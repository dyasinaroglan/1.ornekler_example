package Bolum8.Classes.Exception;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

         /*kullanıcıdan bir cümle alın bu cümleyi string builder a ekleyin.
        sonra kullanıcıdan ayrı bir kelime ve hangi indexden itibaren ekleneceğini alın.
        bu kelimeyi istenilen indexten itibaren ekleyin ve ekrana yazdırın.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle girriniz");
        String cümle = scanner.nextLine();
        StringBuilder str = new StringBuilder(cümle);
        System.out.println("kelime giriniz");
        String kelime = scanner.next(); //tek kelime
        int index ;

        try {
            System.out.println("index giriniz");
            index = scanner.nextInt();
        }catch (Exception e){
            index =0;  //hata olursa o indise yaz diyoruz.
        }
        try {
            str.insert(index,kelime);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(str);

    }
}
