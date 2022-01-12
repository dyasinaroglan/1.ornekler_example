package Classes.PackageStatic.pack4;

import Classes.PackageStatic.pack3.Book;

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.basımYılı=1999; // farklı package larda sadece publicten ulaşım sağlarım.
        Book.yayınevi = "KÜLTÜR";
        //yayınevi de public olduğu için ulaştım.
        //not: farklı package larda sadece publiclere ulaşırım.
    }
}
