package classesExample.task1;

public class MyMath {
    public static double getMax(double x,double y){
        double max = Math.max(x,y);
        return max;
    }
    public static double getMax(double x,double y,double z){
        return  Math.max(Math.max(x,y),z);
    }
    public static double getMin(double x,double y){
        return Math.min(x,y);
    }
    public static double getMin(double x,double y,double z){
        return Math.min(Math.min(x,y),z);
    }
    public static double getMutlak(double x){
        return Math.abs(x);
    }
    public static double getUs(double x,double y){
        return Math.pow(x,y);
    }
    public static double getKarakök(double x){
        return Math.sqrt(x);
    }
    public static double getToplam(double...arg){
        int toplam=0;
        for (double x : arg) {
            toplam+=x;
        }
            return toplam;
        }
        public static double getCarpım(double...arg){
        int carpım =1;
            for (double x : arg) {
                carpım*=x;
            }
            return carpım;
        }
    }

