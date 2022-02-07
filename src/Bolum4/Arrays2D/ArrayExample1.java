package Bolum4.Arrays2D;

public class ArrayExample1 {
    public static void main(String[] args) {
        /*
        Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
        sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
        alan en küçük ve en büyük sayıyı da mesaj olarak göstersin
         */

        int[][] matris = new int[3][2];
        int toplam = 0;
        int enb = 0;
        int enk = 900;



        for (int i = 0; i <= matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                int randomSayı = (int)(Math.random()*100);
                matris[i][j] = randomSayı;
                System.out.println(i + ". satırdaki " + j + ". sütunun elemanı : " + matris[i][j]);
                if(enb<randomSayı){
                    enb = randomSayı;
                }
                if (enk>randomSayı){
                    enk = randomSayı;
                }

            }
        }
        System.out.println("en küçük sayı = " + enk);
        System.out.println("en büyük sayı = " + enb);
    }
}
