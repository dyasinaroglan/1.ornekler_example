package Classes.ExtendExample.Ornek2.package1;

public class Arac {
    public String publicVar;
    protected String protectedVar;
    String defaultVar;
    private String privateVar;


    public void publicMethod(){

    }
    protected void protectedMethod(){

    }
    void defaultMethod(){

    }
    private void privateMethod(){

    }

    public static void main(String[] args) {
        Otomobil o2 = new Otomobil();
        o2.defaultVar="13";
        o2.protectedVar ="14";
        o2.publicVar ="15";

    }
}
