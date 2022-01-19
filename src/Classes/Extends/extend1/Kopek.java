package Classes.Extends.extend1;

public class Kopek extends Hayvan {

    boolean asıVarmı;

    public void havla(){
        System.out.println("havladım");
    }

    public void yemekYe(){

        super.yemekYe(); //ilk önce super in yemekYe methodunu çağırabilirim.
        System.out.println("yemeğimi yedim"); //burada super e ait yemekYe methodunu kullanmadım.
        //kendi methodunu kullandı.

        //super --> extend ettiğimiz class. burada super Hayvan classı.
    }




}
