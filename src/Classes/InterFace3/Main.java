package Classes.InterFace3;

import Classes.SınıflarArasıİliskiler.B;

public class Main {
    public static void main(String[] args) {
        Food baklava = new Baklava("BAKLAVA");
        Food cheeseCake = new CheeseCake("CHESEE CAKE");
        Food greekSalad = new GreekSalad("GREEK SALAD");
        Food sezarSalad = new SezarSalad("SEZAR SALAD");

        bilgiYaz(baklava);
        bilgiYaz(sezarSalad);
        bilgiYaz(cheeseCake);
        bilgiYaz(greekSalad);
    }
    public static void bilgiYaz(Food food){
        System.out.println(food.getName());
        food.madeIn();
        food.taste();
        //Parent ismi ile gelen nesnelerin hangi class ın nesnesi olduğunu anlamak için
        //instanceof kullanıyoruz. food baklavanın nesnesi mi? instanceof
        System.out.println(food instanceof Sweet);
        System.out.println(food instanceof Baklava);
        System.out.println("**********************");

        //Food baklava = new Baklava("BAKLAVA");
        //buradaki Food ile gelen baklava nesnesini Baklava gibi görmem gerekirse
    }
}
