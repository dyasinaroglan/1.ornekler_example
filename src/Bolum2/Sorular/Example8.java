package Bolum2.Sorular;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        /*
        Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için
        hesaplayınız.
                x>0, y<0 ise f(x,y) = 4x+2y+4
                x>0, y=0 ise f(x,y) = 2x-y+3
                x<0, y>0 ise f(x,y) = 3x+4y+3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("x sayısını giriniz");
        int x = scanner.nextInt();
        System.out.println("y sayısını giriniz");
        int islem = 0;
        int y = scanner.nextInt();

        if(x>0 && y<0){
            islem = (4*x) + (2*y) + 4;
        }else if(x>0 && y==0){
            islem = (2*x)-y+3;
        }else if(x<0 && y>0){
            islem = (3*x)+(4*y)+3;
        }
        System.out.println("sonuç = " + islem);

    }
}
