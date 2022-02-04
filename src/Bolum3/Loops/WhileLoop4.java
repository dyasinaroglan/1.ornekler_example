package Bolum3.Loops;

public class WhileLoop4 {
    public static void main(String[] args) {
        //1 den 100 e kadar sayıyı her arttırdığımızda oluşan sayının bir eksiği kadar üzerine ekleme yapan programı yazınız

        /*
        1----3
        2----5
        3----9
        4----17
        5----33
                 */

        int gerçekDeger = 2;
        int count = 1;

        while (gerçekDeger<100){
            gerçekDeger = gerçekDeger+ (gerçekDeger-1);
            System.out.println("DEĞER : " + count + "- SONUÇ : "+ gerçekDeger);
            count++;
        }

    }
}
