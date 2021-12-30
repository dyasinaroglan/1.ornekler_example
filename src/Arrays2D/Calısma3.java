package Arrays2D;

import javax.swing.*;

public class Calısma3 {
    public static void main(String[] args) {
        /*
        {{"15$","56€","33$"},{"67$","78€"},{"100€"}}
        bu sekilde bir fiyat tablonuz var. dolar olanlari 3 ile,
        euro olan fiyatlari 5 ile carpip toplam fiyati bulun.
         */
        String[][] fiyatlar = {{"15$", "56€", "33$" }, {"67$", "78€" }, {"100€" }};
        String fiyat = "";
        int toplam = 0;


        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {
                if (fiyatlar[i][j].contains("$")) {
                    fiyat = fiyatlar[i][j].replaceAll("\\$", "");
                    toplam += Integer.parseInt(fiyat) * 3;
                }
                else {
                    fiyat=fiyatlar[i][j].replaceAll("€","");
                    toplam+=Integer.parseInt(fiyat)*5;
                    }
                }
            }
        System.out.println("toplam :"+toplam);
        }
    }

