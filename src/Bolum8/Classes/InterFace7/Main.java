package Bolum8.Classes.InterFace7;

public class Main {
    public static void main(String[] args) {


    }

    public void test01(){
        Driver chrome = new Chrome();
        chrome.getDriver();
        yazDriver(chrome);
    }
    public void test02(){
        Driver firefox = new FireFox();
        firefox.getDriver();
        yazDriver(firefox);
    }
    public void test03(){
        Driver opera = new Opera();
        opera.getDriver();
        yazDriver(opera);
    }
    public static void yazDriver(Driver driver){
        driver.getDriver();
    }
}
