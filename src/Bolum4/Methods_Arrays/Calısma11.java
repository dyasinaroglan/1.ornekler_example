package Bolum4.Methods_Arrays;

public class Calısma11 {
    public static void main(String[] args) {
        /*
         Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.
         */

        System.out.println(isCorrect("passsddf"));
        System.out.println(isCorrect("dfd12fgs4"));


    }
    public static boolean isCorrect(String password){

        return password.length()>8 && password.length()<12 && !(password.contains("pass"));

        }
    }

