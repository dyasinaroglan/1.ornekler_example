package Classes.Abstract4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        //polymorphism

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new LinkedList<>(); //bu kullanıma polymorphism diyoruz.
        //list bunların hepsini kapsıyor. list türünden bir arrayList veya LinkedList tanımlıyorum.

        Chrome chrome1 = new Chrome("CHROME1");
        Driver chrome = new Chrome("CHROME");
        Driver fireFox = new FireFox("FİREFOX");

        methotA(chrome1);
        //methotA(chrome); //hata verir. çünkü sadece Chrome türünden tanımlanmış sadece. chrome ise Driver olarak tanımlanmış
        methotC(fireFox); // Driver class ından kabul ettiği için hem Driver hem de childClass türlerini kabul ediyor.
        methotC(chrome);
        methotC(chrome1);

    }
    public static void methotA(Chrome driver){
        System.out.println(driver.getDriver());
    }
    public static void methotB(FireFox driver){
        System.out.println(driver.getDriver()); //bunlarda sadece firefoxtan eleman çağırabiliyoruz.
    }
    public static void methotC(Driver driver){
        System.out.println(driver.getDriver()); //polymorphism i kullanarak hepsinden methodu çağırabilirim
        //chrome1, chrome, fireFox hepsini methotC den çağırabilirim.
        //ama methotA kabul etmiyor. çünkü methotA Chrome türünden ayarlanmış. sadece chrome1 i gönderebilirim.
    }
}
