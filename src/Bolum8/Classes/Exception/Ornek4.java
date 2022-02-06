package Bolum8.Classes.Exception;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cümle alın bu cümleyi string builder a ekleyin.
        sonra kullanıcıdan ayrı bir kelime ve hangi indexden itibaren ekleneceğini alın.
        bu kelimeyi istenilen indexten itibaren ekleyin ve ekrana yazdırın.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle = scanner.nextLine();

        StringBuilder str = new StringBuilder(cümle);

        System.out.println("kelime giriniz");
        String kelime = scanner.nextLine();
        int index;

        try {
            System.out.println("index giriniz"); //burada hata int yerine String girmiş olabilir
             index = scanner.nextInt();
        }catch (Exception e){
            index =0; // yani String bir şey girilirse index i 0 yap ve o kelimeyi oraya ekle. 0. indisten itibaren.
        }
        try {
            str.insert(index,kelime);
        }catch (Exception e){
            System.out.println("index hatası ekleme yapılmadı");
        }
        System.out.println(str);
    }
}
