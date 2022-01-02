package ArrayList;

import java.util.Scanner;

public class Calsıma10 {
    public static void main(String[] args) {


    /*1. Parolanın güçlü bir parola olup olmadığını doğrulayabilecek bir program yazın. Güçlü parolaların özellikleri şunlardır:
            1.1 Şifre en az 8 karakter uzunluğunda olmalı ve boşluk içermemelidir
         1.2 Parola en az bir büyük harf içermelidir
         1.3 Parola en az bir küçük harf içermelidir
         1.4 Şifre en az bir özel karakter içermelidir
         1.5 Şifre en az bir rakam içermelidir.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre = scanner.nextLine();

        boolean r1 = sifre.length()>=8 && !sifre.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        //bu şifreyi char bir diziye atayım.
        char[] chars = sifre.toCharArray();
        for (char c : chars) {
            if(Character.isUpperCase(c)){  //en az bir büyük harf içermesi gereken koşul
                r2=true;
            }
            else if(Character.isDigit(c)){  //en az bir rakam içermesi gereken koşul
                r3=true;
            }
            else if(Character.isLowerCase(c)){
                r4=true;
            }
            else {
                r5=true; //özel karakter
            }

        }
        System.out.println(r1&&r2&&r3&&r4&&r5);

    }

}
