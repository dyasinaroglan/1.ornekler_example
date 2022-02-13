package Bolum4.Arrays2D;

public class Array2DExample6 {
    public static void main(String[] args) {

        /*
        {{"15$","56€","33$"},{"67$","78€"},{"100€"}}
        bu sekilde bir fiyat tablonuz var. dolar olanlari 3 ile,
        euro olan fiyatlari 5 ile carpip toplam fiyati bulun.
         */
        String[][] fiyatlar =  {{"15$","56€","33$"},{"67$","78€"},{"100€"}};

        String düzenlenmisFiyat = "";
        int toplam = 0;

        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {
                if(fiyatlar[i][j].contains("$")){
                    düzenlenmisFiyat = fiyatlar[i][j].replaceAll("\\$","");
                    toplam+= Integer.parseInt(düzenlenmisFiyat)*3;
                }else if (fiyatlar[i][j].contains("€")){
                    düzenlenmisFiyat = fiyatlar[i][j].replaceAll("€","");
                    toplam+= Integer.parseInt(düzenlenmisFiyat)*5;
                }
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
