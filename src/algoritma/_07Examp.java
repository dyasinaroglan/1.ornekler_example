package algoritma;

import java.util.Scanner;

public class _07Examp {
     /*
      1. Kullanıcı adı 4 ila 25 karakter arasındadır.
      2. Bir harfle başlamalıdır.
      3. Yalnızca harf, sayı ve alt çizgi karakteri içerebilir.
      4. Alt çizgi karakteri ile bitemez.

      Kullanıcı adı geçerliyse, programınız true dizesini, aksi takdirde false dizesini döndürmelidir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre = scanner.nextLine();

        if (sifre.length() >= 4 && sifre.length() <= 25){
            if(sifre.charAt(0) >= 'a' && sifre.charAt(0)<= 'z'){
                for (int i = 0; i < sifre.length(); i++) {
                    if(sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z'){
                        if(sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9'){
                                if(i == sifre.length()-1){
                                    System.out.println("true");
                                }else {
                                    System.out.println("false");
                                    break;
                                }
                        }else {
                            System.out.println("false");
                            break;
                        }
                    }else {
                        System.out.println("false");
                    }
                }
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
        }
    }
}
