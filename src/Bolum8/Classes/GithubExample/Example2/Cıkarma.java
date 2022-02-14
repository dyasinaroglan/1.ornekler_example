package Bolum8.Classes.GithubExample.Example2;

public class Cıkarma {

    public void cıkarma(int sayı1, int sayı2){
        System.out.println("çıkarma sonucu = " + (sayı1-sayı2));
    }
    public void cıkarma(double sayı1, double sayı2){
        System.out.println("çıkarma sonucu = " + String.format("%.2f",(sayı1-sayı2)));
    }
    public void cıkarma(int sayı1, double sayı2){
        System.out.println("çıkarma sonucu = " + String.format("%.2f",(sayı1-sayı2)));
    }
    public void cıkarma (double sayı1, int sayı2){
        System.out.println("çıkarma sonucu = " + String.format("%.2f", (sayı1-sayı2)));
    }

    public static void main(String[] args) {
        Cıkarma islem = new Cıkarma();
        islem.cıkarma(3,3.2);
        islem.cıkarma(4,3);
        islem.cıkarma(5.4,4.3);
        islem.cıkarma(3.4,4);
    }
}

/*
overLoad methotlar-- aynı işlemi yapan, aynı methot ismini alan farklı sayıda parametresi olan methotlara denir.
aynı zamanda overLoad methotlar ın parametreleri farklı türden değerler alabilirler. (int,double,string...)
 */

