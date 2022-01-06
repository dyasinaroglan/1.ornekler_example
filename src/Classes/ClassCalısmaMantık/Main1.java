package Classes.ClassCalısmaMantık;

public class Main1 {
    static int count=1; //static veriable
    static { //static initiliazer
        System.out.println("static initializer çalıştı.count"+count);
        count++;
    }
    public static void main(String[] args) {
        System.out.println("main başladı.count="+count);
        Arac a1 = new Arac("AUDİ");
        System.out.println("nesne oluştu.nesneCount="+a1.nesneCount);
        System.out.println("main bitti");
    }
}
