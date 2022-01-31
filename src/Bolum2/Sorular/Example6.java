package Bolum2.Sorular;

public class Example6 {
    public static void main(String[] args) {
        /*
        1’den 10a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde yazan bir
uygulamayı for döngüsü ile yazınız. 1,2,3,........ 10
         */

        String virgül = ",";

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if(i != 10){
                System.out.print(virgül);

            }

        }
    }
}
