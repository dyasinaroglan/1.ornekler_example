package Methods;

public class Calısma8 {
    public static void main(String[] args) {
        //OverLoad metotlar --- aynı anda aynı isimde aynı işi yapan metotlar.

        //öyle bir metot ki aynı isimde farklı metotları kullanarak 2,3,4...ve daha fazla sayıyı toplayabiliyoruz.

        topla(3,4,7);
        topla(4,3,3,2);
        topla(3,1,1);
        topla(4,4,6,5,1);


    }
    public static void topla(int x, int y, int z){
        int toplam = x+y+z;
        System.out.println("toplam:"+toplam);
    }
    public static void topla(int x,int y,int z,int k){
        int toplam =x+y+z+k;
        System.out.println("toplam:"+toplam);
    }
    public static void topla(int x,int y,int z,int k,int l){
        int toplam = x+y+z+k+l;
        System.out.println("toplam:"+toplam);
    }
}
