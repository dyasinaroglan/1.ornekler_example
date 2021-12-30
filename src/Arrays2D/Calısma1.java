package Arrays2D;

public class Calısma1 {
    public static void main(String[] args) {
        /*
        5-5 lik bir tabloyu 0-10 arasi sayilarla doldurup yazdirin.
         */

        int[][] tablo = new int[5][5];

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] =(int) (Math.random()*10);  //tabloyu doldurduk

            }

        }
        //tabloyu yazdıralım.

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+" ");

            }
            System.out.println();
        }

    }
}
