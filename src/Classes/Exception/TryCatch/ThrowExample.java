package Classes.Exception.TryCatch;

public class ThrowExample {
    public static void main(String[] args) {

        try {
            double sonuc1 = bolme(10,3);
            double sonuc2 = bolme(7,0);
            System.out.println(sonuc1);
            System.out.println(sonuc2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+"y 0 a bölünemez");
        }

    }

    public static double bolme(double x,double y){
        if (y==0){
            throw new ArithmeticException("Y 0 OLAMAZ!!!");
        }
        return x/y;
    }
}
