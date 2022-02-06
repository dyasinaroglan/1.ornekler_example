package Classes.Abstract4;

public abstract class Driver {
    String isim;

    public Driver(String isim) {
        this.isim = isim;
    }

    public abstract String getDriver();

    public void driverName(){
        System.out.println(isim); //normal methot da yazabilirim. abstract class larda.
    }

}
