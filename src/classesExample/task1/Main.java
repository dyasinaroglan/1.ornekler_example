package classesExample.task1;

public class Main {
    public static void main(String[] args) {
        /*
    Math sınıfindaki metodları kullanarak
	getMax(x, y);
	getMax(x, y, z); (Math.Max(x,y))
	getMin(x, y);
	getMin(x, y, z);
	getMutlak(x);
	getUs(x, y);
	getKarekok(x);
	getToplam(Type...x),
	getCarpım(Type...x)

	methodlarını kendi oluşturacağınız bir sınıfta yazarak
	mainden nesne oluşturmadan direk
	kullanılmasını sağlatacak örnek kullanımlarını yazınız.
	(kendi metodunuzun içinde
	Math.fonksiyonlarını kullanabilirsiniz)

     */

        System.out.println(MyMath.getMax(5,12));
        //YA DA
        double max = MyMath.getMax(67,7);
        System.out.println(max);
        System.out.println("----------------------------");
        System.out.println(MyMath.getMax(3,6,12));
        System.out.println(MyMath.getMin(12,6));
        System.out.println(MyMath.getMutlak(-24));


    }
}
