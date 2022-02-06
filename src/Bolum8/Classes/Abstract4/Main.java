package Bolum8.Classes.Abstract4;

public class Main {

    public static void main(String[] args) {

        Chrome chrome = new Chrome("CHROME");
        FireFox fireFox = new FireFox("FİREFOX");
        System.out.println(chrome.getDriver());
        System.out.println(fireFox.getDriver());
    }
}
