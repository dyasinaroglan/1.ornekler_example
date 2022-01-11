package classesExample.CalısmaUdemy1;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("123456",1000.0,"YASİN","yasinargln@gmail.com","544523");
        acc1.paraYatır(500);
        acc1.paraCek(700);
        acc1.paraCek(2000);

        Account acc2 = new Account();
        acc2.bilgileriYazdır();
        System.out.println("-------------------------------");
        acc1.bilgileriYazdır();

        Account acc3 = new Account();

        Account acc4 = acc3; // ben sana kendimi eşleştirmek istiyorum diyor. acc4=acc3 oluyor
        Account acc5 =new Account();
        if (acc3==acc5){ //burada acc3 ile acc4 aynı şeyi mi veriyor bana diyoruz.
            System.out.println("aynı objeyi gösteriyorlar");
        }else {
            System.out.println("aynı objeyi göstermiyorlar");
        }
        new Account("YASİN","GMAİL.COM","454654").bilgileriYazdır();
        //bu şekilde bir kullanımı var.
    }
}
