package Bolum4.Arrays2D;

public class UdemyEmre1 {
    public static void main(String[] args) {
        //2*3 lük bir matris yapalım
        int[][] sayılar = new int[2][3];
        sayılar[0][0] = 1;
        sayılar[0][1] = 2;
        sayılar[0][2] = 3;

        sayılar[1][0] = 4;
        sayılar[1][1] = 5;
        sayılar[1][2] = 6;

        //3x3 lük matris

        int num[][] = {{1,3,5},{11,13,15},{33,35,37}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+",");

            }
            System.out.println();

        }

    }
}
