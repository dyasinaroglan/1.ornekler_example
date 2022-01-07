package classesExample.UdemyOrnek;

public class Main {
    public static void main(String[] args) {
        //çember isimli sınıf oluşturun. bu sınıfın yarıçap alan kurucusu olmalı. ayrıca çevre ve alanını
        //hesaplayan metotlar olmalıdır.


        Cember c1 = new Cember(5,3.14);
        System.out.printf("çemberin çevresi: %.2f",c1.cevre());
        System.out.println();
        System.out.printf("çemberin alanı: %.2f", c1.alan());


    }
    }
