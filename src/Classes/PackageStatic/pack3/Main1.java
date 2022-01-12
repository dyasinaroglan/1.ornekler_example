package Classes.PackageStatic.pack3;

public class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.sayfaSayısı=150; //default olduğu için.
        b1.basımYılı=2020; //public

        Book.renk="MAVİ";
        Book.yayınevi="İŞ"; //STATİC OLDUĞU İÇİN class ismi ile ulaşabilirim.
        //ayrıca yayınevi-->public
        //renk--> default olduğu için aynı package içinde ulaşabilirim.
    }



}
