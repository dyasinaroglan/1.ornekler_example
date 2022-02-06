package Bolum8.Classes.InterFace6;

public class Main extends ParentClass implements InterFace1,InterFace2{
    //main class ı ParentClass ı extend ederek genişliyor ama aynı zamanda InterFace1 in emirlerini de yerine getiriyor.
    @Override
    public void islem() {
        System.out.println(name + " işlem"); //name nereden geldi? InterFace1 class ından

    }

    @Override
    public void islemInterFace2(int num) {
        System.out.println("interFace 2 : " + num);

    }
    //Interface class lar extend edilmezler impliments edilirler.
    //burada main classı InterFace1 class ının gereklerini yerine getirecektir diyor.


    public static void main(String[] args) {
        ParentClass m1 = new Main();
        InterFace1 m2 = new Main();
        InterFace2 m3 = new Main();
    }

}
