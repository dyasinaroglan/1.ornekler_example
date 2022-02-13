package Bolum4.Arrays2D;

public class Array2DExample4 {
    public static void main(String[] args) {
        /*
        5-5 lik bir tabloyu 0-10 arasi sayilarla doldurup yazdirin.
         */

        int[][] tablo = new int[5][5];

        for (int i = 0; i < tablo.length; i++) { //tabloyu oluşturduk.
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random()*10+1); //iki boyutlu dizimin içine tablo[i][j] random olarak sayıları yerleştirdim.
            }
        }
        for (int i = 0; i < tablo.length; i++) { //tabloyu yazdırdık.
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+ " ");
            }
            System.out.println();//j döngüsünden çıktıktan sonra bir alt satıra geçmesi için
        }
    }
}
