package Bolum4.Methods;

public class MethodsExample10 {
    public static void main(String[] args) {
        /*
         Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.
         */

        System.out.println(passwordCorrect("pass123fg"));
        System.out.println(passwordCorrect("sadsdyasi"));
        System.out.println(passwordCorrect("asd"));
        System.out.println(passwordCorrect("asdsdaa"));


    }
    public static boolean passwordCorrect(String password){

        return (password.length()>8 && !(password.contains("pass")) && password.length()<=12);

    }
}
