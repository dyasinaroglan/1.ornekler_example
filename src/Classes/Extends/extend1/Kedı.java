package Classes.Extends.extend1;

public class Kedı extends Hayvan {

    boolean asıVarmı;
    String evi;

    public void miyavla(){
        System.out.println("miyavladım");
    }


    public void yemekYe() {
        super.yemekYe();  //yemekYe methodu Hayvan class ına ait.overrideMethodlara tıklayıp methotlarıda
        //bu şekilde kullanabiliriz.

        //super diyorsak bu parent clas daki methodu çağırır bize.
    }
}


