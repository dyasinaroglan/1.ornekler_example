package Bolum8.Classes.modifiers.Classes.package1;

public class Main1 {
    public static void main(String[] args) {

        //PUBLİC OLDUĞU İÇİN HER YERDEN ULAŞILIR.
        PublicClass p = new PublicClass();

        //DEFAULT OLDUĞU İÇİN AYNI PACKAGE DEN ULAŞILIR. main1 ve defaultClass aynı package de.
        DefaultClass d = new DefaultClass();
    }
}
